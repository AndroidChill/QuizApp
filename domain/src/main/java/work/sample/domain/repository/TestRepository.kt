package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.saveTest.SaveTestResponse
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse

interface TestRepository {

    suspend fun testDetail(request: TestDetailRequest) : Flow<DataState<TestDetailResponse>>

    suspend fun saveTest(request: SaveTestRequest) : Flow<DataState<SaveTestResponse>>

    suspend fun historyMy() : Flow<DataState<List<TestHistoryMyResponse>>>

    suspend fun historyAll() : Flow<DataState<List<TestHistoryAllResponse>>>

}