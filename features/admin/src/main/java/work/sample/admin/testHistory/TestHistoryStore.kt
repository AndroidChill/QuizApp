package work.sample.admin.testHistory

import work.sample.admin.testHistory.middleware.TestHistoryMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.TestProcessUseCase
import javax.inject.Inject

class TestHistoryStore @Inject constructor(
    testUseCase: TestProcessUseCase
) : Store<TestHistoryState, TestHistoryAction, TestHistoryNews>(testUseCase){
    init {
        middlewares = listOf(TestHistoryMiddleware(this))
        reducer = TestHistoryReducer()
    }
}