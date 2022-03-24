package work.sample.admin.main.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.MainStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import work.sample.navigation.params.screens.admin.GroupCreateScreenParams
import work.sample.navigation.params.screens.admin.GroupDetailScreenParams
import work.sample.navigation.params.screens.admin.GroupRequestScreenParams
import work.sample.navigation.params.screens.test.TestDetailScreenParams
import work.sample.navigation.params.screens.test.TestHistoryScreenParams
import javax.inject.Inject

class MainViewModel @Inject constructor() : BaseViewModel<MainState, MainAction, MainNews>() {

    override val stateFlow = MutableStateFlow<MainState>(MainState.Default)
    override val actionFlow = MutableSharedFlow<MainAction?>()
    override val newsFlow = MutableSharedFlow<MainNews>()

    @Inject
    override lateinit var store: MainStore

    @Inject
    lateinit var router: Router

    fun navigateToCreateGroup() {
        router.navigate(GroupCreateScreenParams)
    }

    fun navigateToRequestGroup() {
        router.navigate(GroupRequestScreenParams)
    }

    fun navigateToDetailsGroup(groupId: Int, title: String) {
        router.navigate(
            GroupDetailScreenParams(
                groupId = groupId,
                title = title
            )
        )
    }

    fun navigateToTestDetail(testId: Int, title: String) {
        router.navigate(TestDetailScreenParams(testId, title))
    }

    fun navigateHistory(roleId: Int) {
        router.navigate(TestHistoryScreenParams(roleId))
    }
}
