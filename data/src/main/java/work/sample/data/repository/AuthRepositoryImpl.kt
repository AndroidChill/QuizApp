package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import work.sample.core.DataState
import work.sample.core.toSuccess
import work.sample.data.dataSource.AuthNetworkDataSource
import work.sample.data.models.authCheck.AuthCheckRequest
import work.sample.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val authNetworkDataSource: AuthNetworkDataSource
) : AuthRepository {

    override suspend fun authCheck(phone: String): Flow<DataState<Boolean>> =
        authNetworkDataSource.authCheck(AuthCheckRequest(phone))
            .map {
                DataState.Success(
                    // возвращаем ответ, авторизован пользователь или нет
                    it.toSuccess().id != 0
                )
            }

}