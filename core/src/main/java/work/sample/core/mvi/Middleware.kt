package work.sample.core.mvi

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.core.UseCase
import java.lang.Exception

abstract class Middleware<A>(store: Store<*, *, *>) {

    var apiUseCase: UseCase = store.useCase

    abstract suspend fun effect(action: A): A?
    suspend operator fun invoke(action: A) = effect(action)

    suspend fun <T> doRequest(
        responseAsync: Flow<DataState<T>>,
        onOk: (T) -> Unit,
        onLoading: () -> Unit,
        onError: (Exception) -> Unit
    ) {
        responseAsync
            .collect {
                when (it) {
                    is DataState.Success -> {
                        onOk(it.data)
                    }
                    is DataState.Loading -> {
                        onLoading()
                    }
                    is DataState.Error -> {
                        onError(it.exception)
                    }
                }
            }
    }

    suspend fun <T> doRequestCompletable(
        responseAsync: suspend () -> Flow<T>,
        onOk: () -> Unit,
        onError: (Exception) -> Unit
    ) {
        responseAsync
    }

}