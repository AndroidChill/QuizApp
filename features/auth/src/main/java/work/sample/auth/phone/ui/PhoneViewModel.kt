package work.sample.auth.phone.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.auth.phone.PhoneAction
import work.sample.auth.phone.PhoneNews
import work.sample.auth.phone.PhoneState
import work.sample.auth.phone.PhoneStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import javax.inject.Inject

class PhoneViewModel @Inject constructor() : BaseViewModel<PhoneState, PhoneAction, PhoneNews>() {

    override val stateFlow = MutableStateFlow<PhoneState>(PhoneState.Default)
    override val actionFlow = MutableSharedFlow<PhoneAction?>()
    override val newsFlow = MutableSharedFlow<PhoneNews>()

    @Inject
    override lateinit var store: PhoneStore

    @Inject
    lateinit var router: Router

    fun back() {
        router.back()
    }

}