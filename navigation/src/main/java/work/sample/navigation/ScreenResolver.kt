package work.sample.navigation

import androidx.navigation.NavController
import work.sample.navigation.params.screens.ScreenParams

interface ScreenResolver {

    fun navigate(
        navController: NavController?,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    )

}