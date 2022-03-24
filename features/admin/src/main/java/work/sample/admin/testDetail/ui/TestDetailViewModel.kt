package work.sample.admin.testDetail.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.MainStore
import work.sample.admin.testDetail.TestDetailAction
import work.sample.admin.testDetail.TestDetailNews
import work.sample.admin.testDetail.TestDetailState
import work.sample.admin.testDetail.TestDetailStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import javax.inject.Inject

class TestDetailViewModel @Inject constructor()
    : BaseViewModel<TestDetailState, TestDetailAction, TestDetailNews>() {

    override val stateFlow = MutableStateFlow<TestDetailState>(TestDetailState.Default)
    override val actionFlow = MutableSharedFlow<TestDetailAction?>()
    override val newsFlow = MutableSharedFlow<TestDetailNews>()

    @Inject
    override lateinit var store: TestDetailStore

    @Inject
    lateinit var router: Router
}