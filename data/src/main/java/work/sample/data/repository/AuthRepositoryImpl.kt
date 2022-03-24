package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import work.sample.core.DataState
import work.sample.core.toSuccess
import work.sample.data.TokenHolder
import work.sample.data.dataSource.AuthNetworkDataSource
import work.sample.data.models.signIn.SignInRequest
import work.sample.data.models.signUp.SignUpRequest
import work.sample.data.models.authCheck.AuthCheckRequest
import work.sample.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val authNetworkDataSource: AuthNetworkDataSource,
    private val tokenHolder: TokenHolder
) : AuthRepository {

    override suspend fun checkToken(): Flow<DataState<Boolean>> {
        return flow {
            emit(DataState.Success(tokenHolder.isNotEmptyToken()))
        }
    }

    override suspend fun authCheck(phone: String): Flow<DataState<Boolean>> =
        authNetworkDataSource.authCheck(AuthCheckRequest(phone))
            .map {
                DataState.Success(
                    // возвращаем ответ, авторизован пользователь или нет
                    it.toSuccess().id != 0
                )
            }

    override suspend fun signIn(phone: String, name: String) =
        authNetworkDataSource.signIn(
            SignInRequest(
                phone, name
            )
        )
            .map {
                tokenHolder.set(it.toSuccess().token)
            DataState.Success(tokenHolder.isNotEmptyToken())
        }

    override suspend fun signUp(
        phone: String,
        name: String,
        roleId: Int
    )  =
        authNetworkDataSource.signUp(
            SignUpRequest(
                phone, name, roleId
            )
        ).map {
            tokenHolder.set(it.toSuccess().token)
            DataState.Success(it.toSuccess().token.isNotEmpty())
        }

}