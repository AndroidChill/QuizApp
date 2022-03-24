package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.data.dataSource.TestNetworkDataSource
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
import work.sample.domain.repository.TestRepository

class TestRepositoryImpl(
    private val testNetworkDataSource: TestNetworkDataSource
) : TestRepository {
    override suspend fun testDetail(request: TestDetailRequest): Flow<DataState<TestDetailResponse>> {
        return testNetworkDataSource.testDetail(request)
    }
}