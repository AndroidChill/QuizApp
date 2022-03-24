package work.sample.admin.testHistory.middleware

import work.sample.admin.main.MainAction
import work.sample.admin.testHistory.TestHistoryAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.TestProcessUseCase
import work.sample.domain.usecase.UserInfoUseCase

class TestHistoryMiddleware(store: Store<*, *, *>) : Middleware<TestHistoryAction>(store) {

    override suspend fun effect(action: TestHistoryAction): TestHistoryAction? {
        var effect: TestHistoryAction? = null

        when (action) {
            is TestHistoryAction.TestHistoryAll -> {
                doRequest(
                    responseAsync = (apiUseCase as TestProcessUseCase).historyAll(),
                    onOk = {
                        effect = TestHistoryAction.TestHistoryAllSuccess(it)
                    },
                    onError = {},
                    onLoading = {

                    }
                )
            }
            is TestHistoryAction.TestHistoryMy -> {
                doRequest(
                    responseAsync = (apiUseCase as TestProcessUseCase).historyMy(),
                    onOk = {
                        effect = TestHistoryAction.TestHistoryMySuccess(it)
                    },
                    onError = {},
                    onLoading = {

                    }
                )
            }
        }

        return effect
    }

}