package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.data.dataSource.GroupNetworkDataSource
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.domain.models.UserBody
import work.sample.domain.repository.GroupRepository

class GroupRepositoryImpl(
    private val groupNetworkDataSource: GroupNetworkDataSource
) : GroupRepository {

    override suspend fun groupDetail(groupId: Int): Flow<DataState<List<UserBody>>> {
        return groupNetworkDataSource.groupDetail(
            GroupDetailsRequest(groupId)
        )
    }

}