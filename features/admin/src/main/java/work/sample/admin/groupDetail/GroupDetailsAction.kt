package work.sample.admin.groupDetail

import work.sample.core.mvi.Action
import work.sample.domain.models.UserBody

sealed class GroupDetailsAction : Action {

    data class GroupDetailRequest(val groupId: Int): GroupDetailsAction()

    data class GroupDetailsRequestSuccess(val data: List<UserBody>) : GroupDetailsAction()

}