package work.sample.quizapp.di.module.navigation

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import work.sample.navigation.NavigationData
import work.sample.navigation.bundle.BundleCreator
import work.sample.navigation.params.screens.SignInScreenParams
import work.sample.navigation.params.screens.auth.PhoneScreenParams
import work.sample.quizapp.R

@Module
class NavigationScreenMapModule {

    @IntoMap
    @Provides
    @ScreenKey(PhoneScreenParams::class)
    fun introFragmentToSignInFragment() : NavigationData = NavigationData(
        navId = work.sample.auth.R.id.action_fragment_intro_to_fragment_phone,
        bundleCreator = BundleCreator.empty()
    )

}