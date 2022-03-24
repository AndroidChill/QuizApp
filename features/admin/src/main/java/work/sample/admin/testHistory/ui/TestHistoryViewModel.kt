package work.sample.admin.testHistory.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.MainStore
import work.sample.admin.testHistory.TestHistoryAction
import work.sample.admin.testHistory.TestHistoryNews
import work.sample.admin.testHistory.TestHistoryState
import work.sample.admin.testHistory.TestHistoryStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import javax.inject.Inject

class TestHistoryViewModel @Inject constructor()
    : BaseViewModel<TestHistoryState, TestHistoryAction, TestHistoryNews>() {

    override val stateFlow = MutableStateFlow<TestHistoryState>(TestHistoryState.Default)
    override val actionFlow = MutableSharedFlow<TestHistoryAction?>()
    override val newsFlow = MutableSharedFlow<TestHistoryNews>()

    @Inject
    override lateinit var store: TestHistoryStore

    @Inject
    lateinit var router: Router

}