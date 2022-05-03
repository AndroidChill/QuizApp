package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.data.dataSource.GroupNetworkDataSource
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.domain.models.UserBody
import work.sample.domain.models.group.create.GroupCreateRequest
import work.sample.domain.models.group.create.GroupCreateResponse
import work.sample.domain.models.group.invite.GroupInviteRequest
import work.sample.domain.models.group.invite.GroupInviteResponse
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.models.group.invite.active.InviteActiveResponse
import work.sample.domain.models.group.invite.list.InviteListResponse
import work.sample.domain.repository.GroupRepository

class GroupRepositoryImpl(
    private val groupNetworkDataSource: GroupNetworkDataSource
) : GroupRepository {

    override suspend fun groupDetail(groupId: Int): Flow<DataState<List<UserBody>>> {
        return groupNetworkDataSource.groupDetail(
            GroupDetailsRequest(groupId)
        )
    }

    override suspend fun groupCreate(request: GroupCreateRequest): Flow<DataState<GroupCreateResponse>> {
        return groupNetworkDataSource.groupCreate(request)
    }

    override suspend fun groupInvite(request: GroupInviteRequest): Flow<DataState<GroupInviteResponse>> {
        return groupNetworkDataSource.groupInvite(request)
    }

    override suspend fun groupInviteList(): Flow<DataState<List<InviteListResponse>>> {
        return groupNetworkDataSource.groupInviteList()
    }

    override suspend fun groupInviteActive(request: InviteActiveRequest): Flow<DataState<InviteActiveResponse>> {
        return groupNetworkDataSource.groupInviteActive(request)
    }

}