package work.sample.admin.testDetail

import work.sample.admin.main.MainReducer
import work.sample.admin.main.middlewares.MainMiddleware
import work.sample.admin.testDetail.middleware.TestDetailMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.TestProcessUseCase
import javax.inject.Inject

class TestDetailStore @Inject constructor(
    testUseCase: TestProcessUseCase
) : Store<TestDetailState, TestDetailAction, TestDetailNews>(testUseCase) {

    init {
        middlewares = listOf(TestDetailMiddleware(this))
        reducer = TestDetailReducer()
    }

}