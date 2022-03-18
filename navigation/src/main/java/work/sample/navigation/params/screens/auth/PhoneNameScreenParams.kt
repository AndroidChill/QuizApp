package work.sample.navigation.params.screens.auth

import work.sample.navigation.params.screens.ScreenParams

data class PhoneNameScreenParams(
    val action: Int,
    val phone: String
) : ScreenParams