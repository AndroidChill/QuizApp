package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import work.sample.core.DataState
import work.sample.data.TokenHolder
import work.sample.domain.models.info.InfoUserBody
import work.sample.data.service.UserService
import javax.inject.Inject

class UserNetworkDataSource @Inject constructor(
    val userService: UserService,
    val tokenHolder: TokenHolder
){

    suspend fun infoUser() : Flow<DataState<InfoUserBody>> {
        return flow<DataState<InfoUserBody>> {
            emit(DataState.Success(userService.infoUser(tokenHolder.get())))
        }
            .catch {
                val et = it
            }.flowOn(Dispatchers.IO)

    }

}