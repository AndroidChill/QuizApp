package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.models.group.create.GroupCreateRequest
import work.sample.domain.models.group.invite.GroupInviteRequest
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.repository.GroupRepository
import javax.inject.Inject

class GroupUseCase @Inject constructor(
    private val groupRepository: GroupRepository
) : UseCase {

    suspend fun groupDetail(groupId: Int) =
        groupRepository.groupDetail(groupId)

    suspend fun groupCreate(name: String) =
        groupRepository.groupCreate(
            GroupCreateRequest(name)
        )

    suspend fun groupInvite(request: GroupInviteRequest) =
        groupRepository.groupInvite(request)

    suspend fun groupInviteList() =
        groupRepository.groupInviteList()

    suspend fun inviteActive(request: InviteActiveRequest) =
        groupRepository.groupInviteActive(request)
}