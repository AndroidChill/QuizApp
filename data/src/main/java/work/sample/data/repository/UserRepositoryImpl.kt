package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.data.dataSource.UserNetworkDataSource
import work.sample.domain.models.info.InfoUserBody
import work.sample.domain.repository.UserRepository

class UserRepositoryImpl(
    private val userNetworkDataSource: UserNetworkDataSource
) : UserRepository {

    override suspend fun userInfo(): Flow<DataState<InfoUserBody>> {
        return userNetworkDataSource.infoUser()
    }


}