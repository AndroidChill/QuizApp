package work.sample.navigation.params.screens.admin

import work.sample.navigation.params.screens.ScreenParams

data class GroupDetailScreenParams(
    val groupId: Int,
    val title: String
) : ScreenParams