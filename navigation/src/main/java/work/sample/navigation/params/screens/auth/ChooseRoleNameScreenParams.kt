package work.sample.navigation.params.screens.auth

import work.sample.navigation.params.screens.ScreenParams

/**
 * signin - 1
 * signup - 0
 */
data class ChooseRoleNameScreenParams(
    val action: Int,
    val phone: String,
    val roleId: Int
) : ScreenParams