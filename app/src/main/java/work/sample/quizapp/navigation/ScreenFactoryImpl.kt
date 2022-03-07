package work.sample.quizapp.navigation

import androidx.fragment.app.Fragment
import work.sample.navigation.ScreenFactory
import work.sample.navigation.params.screens.ScreenParams
import javax.inject.Inject

class ScreenFactoryImpl @Inject constructor() : ScreenFactory {
    override fun getFragment(data: ScreenParams): Fragment? = when (data) {
//        is RegistrationScreenParams -> RegistrationFragment()
        else -> null
    }
}