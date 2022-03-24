package work.sample.admin.main

import work.sample.core.mvi.State
import work.sample.domain.models.info.InfoUserBody

sealed class MainState : State{

    object Default: MainState()

    object InfoUserLoading : MainState()

    data class InfoUserShow(val data: InfoUserBody) : MainState()

}