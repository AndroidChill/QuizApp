package work.sample.admin.main

import work.sample.core.mvi.Action
import work.sample.domain.models.info.InfoUserBody

sealed class MainAction : Action {

    object InfoUser: MainAction()

    object InfoUserLoading : MainAction()

    data class InfoUserError(val e: Exception) : MainAction()

    data class InfoUserSuccess(val data: InfoUserBody) : MainAction()

}