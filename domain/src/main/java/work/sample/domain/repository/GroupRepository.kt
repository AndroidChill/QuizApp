package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.domain.models.UserBody
import work.sample.domain.models.group.create.GroupCreateRequest
import work.sample.domain.models.group.create.GroupCreateResponse
import work.sample.domain.models.group.invite.GroupInviteRequest
import work.sample.domain.models.group.invite.GroupInviteResponse
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.models.group.invite.active.InviteActiveResponse
import work.sample.domain.models.group.invite.list.InviteListResponse

interface GroupRepository {

    suspend fun groupDetail(groupId: Int) : Flow<DataState<List<UserBody>>>

    suspend fun groupCreate(request: GroupCreateRequest) : Flow<DataState<GroupCreateResponse>>

    suspend fun groupInvite(request: GroupInviteRequest) : Flow<DataState<GroupInviteResponse>>

    suspend fun groupInviteList() : Flow<DataState<List<InviteListResponse>>>

    suspend fun groupInviteActive(request: InviteActiveRequest) : Flow<DataState<InviteActiveResponse>>
}