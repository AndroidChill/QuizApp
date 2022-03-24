package work.sample.admin.testHistory

import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.core.mvi.Reducer

class TestHistoryReducer : Reducer<TestHistoryState, TestHistoryAction, TestHistoryNews> {

    override fun reduce(
        state: TestHistoryState,
        action: TestHistoryAction
    ): Pair<TestHistoryState?, TestHistoryNews?> {
        var reducedState: TestHistoryState? = null
        var reducedNews: TestHistoryNews? = null

        when (action) {
            is TestHistoryAction.TestHistoryAllSuccess -> {
                reducedState = TestHistoryState.TestHistoryAllSuccess(action.data)
            }
            is TestHistoryAction.TestHistoryMySuccess -> {
                reducedState = TestHistoryState.TestHistoryMySuccess(action.data)
            }
        }

        return reducedState to reducedNews
    }

}