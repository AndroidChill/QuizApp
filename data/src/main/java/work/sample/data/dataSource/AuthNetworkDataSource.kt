package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.data.models.auth.signin.SignInRequest
import work.sample.data.models.auth.signin.SignInResponse
import work.sample.data.models.auth.signup.SignUpRequest
import work.sample.data.models.auth.signup.SignUpResponse
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
        // проверка на ошибки
    }.flowOn(Dispatchers.IO)

    suspend fun signIn(request: SignInRequest) = flow<DataState<SignInResponse>> {
        emit(DataState.Success(authService.signIn(request)))
    }.catch {
        // проверка на ошибки
    }.flowOn(Dispatchers.IO)

    suspend fun signUp(request: SignUpRequest) = flow<DataState<SignUpResponse>> {
        emit(DataState.Success(authService.signUp(request)))
    }.catch {
        // проверка на ошибки
    }.flowOn(Dispatchers.IO)

}