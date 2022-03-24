package work.sample.navigation.params.screens.test

import work.sample.navigation.params.screens.ScreenParams

data class TestDetailScreenParams(
    var testId: Int,
    var testTitle: String
) : ScreenParams