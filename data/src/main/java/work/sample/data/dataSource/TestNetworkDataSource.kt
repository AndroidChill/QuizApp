package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.data.TokenHolder
import work.sample.data.service.TestService
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.saveTest.SaveTestResponse
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse
import javax.inject.Inject

class TestNetworkDataSource @Inject constructor(
    val testService: TestService,
    val tokenHolder: TokenHolder
){

    suspend fun testDetail(request: TestDetailRequest) : Flow<DataState<TestDetailResponse>> {
        return flow<DataState<TestDetailResponse>> {
            emit(DataState.Success(testService.testDetail(tokenHolder.get(), request)))
        }.flowOn(Dispatchers.IO)
    }

    suspend fun saveTest(request: SaveTestRequest) : Flow<DataState<SaveTestResponse>> {
        return flow<DataState<SaveTestResponse>> {
            emit(DataState.Success(testService.testSave(tokenHolder.get(), request)))
        }.flowOn(Dispatchers.IO)
    }

    suspend fun historyMy() : Flow<DataState<List<TestHistoryMyResponse>>> {
        return flow<DataState<List<TestHistoryMyResponse>>> {
            emit(DataState.Success(testService.historyMyTest(tokenHolder.get())))
        }.flowOn(Dispatchers.IO)
    }

    suspend fun historyAll() : Flow<DataState<List<TestHistoryAllResponse>>> {
        return flow<DataState<List<TestHistoryAllResponse>>> {
            emit(DataState.Success(testService.historyAllTest(tokenHolder.get())))
        }.flowOn(Dispatchers.IO)
    }

}