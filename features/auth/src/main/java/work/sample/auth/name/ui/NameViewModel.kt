package work.sample.auth.name.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.auth.name.NameAction
import work.sample.auth.name.NameNews
import work.sample.auth.name.NameState
import work.sample.auth.name.NameStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import javax.inject.Inject

class NameViewModel @Inject constructor() : BaseViewModel<NameState, NameAction, NameNews>() {

    override val stateFlow = MutableStateFlow<NameState>(NameState.Default)
    override val actionFlow = MutableSharedFlow<NameAction?>()
    override val newsFlow = MutableSharedFlow<NameNews>()

    @Inject
    override lateinit var store: NameStore

    @Inject
    lateinit var router: Router

    fun back() {
        router.back()
    }
}