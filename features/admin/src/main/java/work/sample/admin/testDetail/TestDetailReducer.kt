package work.sample.admin.testDetail

import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.core.mvi.Reducer

class TestDetailReducer : Reducer<TestDetailState, TestDetailAction, TestDetailNews> {

    override fun reduce(
        state: TestDetailState,
        action: TestDetailAction
    ): Pair<TestDetailState?, TestDetailNews?> {
        var reducedState: TestDetailState? = null
        var reducedNews: TestDetailNews? = null

        when (action) {
            is TestDetailAction.TestDetailSuccess -> {
                reducedState = TestDetailState.TestDetailSuccess(action.test)
            }
            is TestDetailAction.TestSaveSuccess -> {
                reducedState = TestDetailState.TestSaveSuccess
            }
        }

        return reducedState to reducedNews
    }

}