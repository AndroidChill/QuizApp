package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.data.TokenHolder
import work.sample.data.service.TestService
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
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

}