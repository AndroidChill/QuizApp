package work.sample.data.dataSource

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import work.sample.core.DataState
import work.sample.data.TokenHolder
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.data.service.GroupService
import work.sample.domain.models.UserBody
import work.sample.domain.models.group.create.GroupCreateRequest
import work.sample.domain.models.group.create.GroupCreateResponse
import work.sample.domain.models.group.invite.GroupInviteRequest
import work.sample.domain.models.group.invite.GroupInviteResponse
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.models.group.invite.active.InviteActiveResponse
import work.sample.domain.models.group.invite.list.InviteListResponse
import javax.inject.Inject

class GroupNetworkDataSource @Inject constructor(
    val groupService: GroupService,
    val tokenHolder: TokenHolder
) {

    suspend fun groupDetail(request: GroupDetailsRequest) : Flow<DataState<List<UserBody>>> {
        return flow<DataState<List<UserBody>>> {
            emit(DataState.Success(groupService.groupDetail(tokenHolder.get(), request)))
        }
    }

    suspend fun groupCreate(request: GroupCreateRequest) : Flow<DataState<GroupCreateResponse>> {
        return flow<DataState<GroupCreateResponse>> {
            emit(DataState.Success(groupService.groupCreate(tokenHolder.get(), request)))
        }
    }

    suspend fun groupInvite(request: GroupInviteRequest) : Flow<DataState<GroupInviteResponse>> {
        return flow<DataState<GroupInviteResponse>> {
            emit(DataState.Success(groupService.groupInvite(tokenHolder.get(), request)))
        }
    }

    suspend fun groupInviteList() : Flow<DataState<List<InviteListResponse>>> {
        return flow<DataState<List<InviteListResponse>>> {
            emit(DataState.Success(groupService.groupInviteList(tokenHolder.get())))
        }
    }

    suspend fun groupInviteActive(request: InviteActiveRequest) : Flow<DataState<InviteActiveResponse>> {
        return flow<DataState<InviteActiveResponse>> {
            emit(DataState.Success(groupService.groupInviteActive(tokenHolder.get(), request)))
        }
    }

}