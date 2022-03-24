package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse

interface TestRepository {

    suspend fun testDetail(request: TestDetailRequest) : Flow<DataState<TestDetailResponse>>

}