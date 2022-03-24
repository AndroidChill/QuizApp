package work.sample.admin.groupDetail

import work.sample.core.mvi.State
import work.sample.domain.models.UserBody

sealed class GroupDetailState : State {

    object Default: GroupDetailState()

    data class GroupDetailsSuccess(val data: List<UserBody>): GroupDetailState()

}