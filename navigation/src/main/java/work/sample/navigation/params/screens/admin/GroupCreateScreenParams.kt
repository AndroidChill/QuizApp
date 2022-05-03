package work.sample.navigation.params.screens.admin

import work.sample.navigation.params.screens.ScreenParams
import java.io.Serializable

data class GroupCreateScreenParams(
    val callback: GroupCreateCallback
) : ScreenParams

interface GroupCreateCallback : Serializable {
    fun onCompleted()
}