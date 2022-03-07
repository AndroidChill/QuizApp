package work.sample.navigation

import androidx.fragment.app.Fragment
import work.sample.navigation.params.screens.ScreenParams

interface ScreenFactory {

    fun getFragment(data: ScreenParams): Fragment?

}