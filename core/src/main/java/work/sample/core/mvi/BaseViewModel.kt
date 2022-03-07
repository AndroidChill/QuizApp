package work.sample.core.mvi

import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

abstract class BaseViewModel<S: State, A: Action, N: News>: ViewModel() {

    abstract val stateFlow: MutableStateFlow<S>
    abstract val newsFlow: MutableSharedFlow<N>
    abstract val actionFlow: MutableSharedFlow<A?>
    abstract val store: Store<S, A, N>

    suspend fun obtainAction(action: A) {
        actionFlow.emit(action)
    }

    fun obtainState(state: S) {
        viewModelScope.launch {
            stateFlow.emit(state)
        }
    }

    override fun onCleared() {
        super.onCleared()
    }

    fun bind(lifecycleCoroutineScope: LifecycleCoroutineScope, mviView: MviView<S, N>) {

        stateFlow
            .onEach(mviView::renderState)
            .launchWhenStarted(lifecycleCoroutineScope)

        newsFlow
            .onEach(mviView::renderNews)
            .launchWhenStarted(lifecycleCoroutineScope)

        lifecycleCoroutineScope.launch {
            actionFlow.collect {
                it?.let {

                    CoroutineScope(Dispatchers.Default).launch {
                        store.middlewares.forEach { middleware ->
                            middleware(it)?.let {
                                actionFlow.emit(it)
                            }
                        }
                    }

                    val reduced = store.reducer(stateFlow.value, it)
                    reduced.first?.let {
                        stateFlow.value = it
                    }
                    reduced.second?.let {
                        newsFlow.emit(it)
                    }
                }
            }
        }
    }

}

fun <T> Flow<T>.launchWhenStarted(lifecycleScope: LifecycleCoroutineScope) {
    lifecycleScope.launchWhenStarted {
        this@launchWhenStarted.collect()
    }
}