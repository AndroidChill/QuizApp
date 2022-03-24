package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.data.dataSource.TestNetworkDataSource
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.saveTest.SaveTestResponse
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse
import work.sample.domain.repository.TestRepository

class TestRepositoryImpl(
    private val testNetworkDataSource: TestNetworkDataSource
) : TestRepository {
    override suspend fun testDetail(request: TestDetailRequest): Flow<DataState<TestDetailResponse>> {
        return testNetworkDataSource.testDetail(request)
    }

    override suspend fun saveTest(request: SaveTestRequest): Flow<DataState<SaveTestResponse>> {
        return testNetworkDataSource.saveTest(request)
    }

    override suspend fun historyMy(): Flow<DataState<List<TestHistoryMyResponse>>> {
        return testNetworkDataSource.historyMy()
    }

    override suspend fun historyAll(): Flow<DataState<List<TestHistoryAllResponse>>> {
        return testNetworkDataSource.historyAll()
    }
}