package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.data.models.authCheck.AuthCheckRequest
import work.sample.data.models.authCheck.AuthCheckResponse
import work.sample.data.service.AuthService
import javax.inject.Inject

class AuthNetworkDataSource @Inject constructor(
    private val authService: AuthService
){

    suspend fun authCheck(request: AuthCheckRequest) = flow<DataState<AuthCheckResponse>> {
        emit(DataState.Success(authService.authCheck(request)))
    }.catch {

    }.flowOn(Dispatchers.IO)

}