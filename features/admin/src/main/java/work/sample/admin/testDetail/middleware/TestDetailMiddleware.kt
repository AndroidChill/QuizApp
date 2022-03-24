package work.sample.admin.testDetail.middleware

import work.sample.admin.testDetail.TestDetailAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.usecase.TestProcessUseCase

class TestDetailMiddleware(store: Store<*, *, *>) : Middleware<TestDetailAction>(store) {

    override suspend fun effect(action: TestDetailAction): TestDetailAction? {
        var effect: TestDetailAction? = null

        when(action) {
            is TestDetailAction.TestDetail -> {
                doRequest(
                    responseAsync = (apiUseCase as TestProcessUseCase).testDetail(TestDetailRequest(action.id)),
                    onOk = {
                        effect = TestDetailAction.TestDetailSuccess(it)
                    },
                    onLoading = {},
                    onError = {}
                )
            }
            is TestDetailAction.TestSave -> {
                doRequest(
                    responseAsync = (apiUseCase as TestProcessUseCase).saveTest(action.request),
                    onOk = {
                        effect = TestDetailAction.TestSaveSuccess
                    },
                    onLoading = {},
                    onError = {}
                )
            }
        }

        return effect
    }

}