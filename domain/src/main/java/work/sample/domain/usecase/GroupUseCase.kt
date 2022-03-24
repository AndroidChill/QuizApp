package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.GroupRepository
import javax.inject.Inject

class GroupUseCase @Inject constructor(
    private val groupRepository: GroupRepository
) : UseCase {

    suspend fun groupDetail(groupId: Int) =
        groupRepository.groupDetail(groupId)

}