package work.sample.quizapp.di.module.navigation

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import work.sample.auth.chooseRole.ChooseRoleFragment
import work.sample.auth.name.ui.NameFragment
import work.sample.navigation.NavigationData
import work.sample.navigation.bundle.BundleCreator
import work.sample.navigation.bundle.bundleCreateDelegate
import work.sample.navigation.params.screens.admin.GroupCreateScreenParams
import work.sample.navigation.params.screens.auth.ChooseRoleScreenParams
import work.sample.navigation.params.screens.auth.ChooseRoleNameScreenParams
import work.sample.navigation.params.screens.auth.PhoneNameScreenParams
import work.sample.navigation.params.screens.auth.PhoneScreenParams

@Module
class NavigationScreenMapModule {

    @IntoMap
    @Provides
    @ScreenKey(PhoneScreenParams::class)
    fun introFragmentToSignInFragment() : NavigationData = NavigationData(
        navId = work.sample.auth.R.id.action_fragment_intro_to_fragment_phone,
        bundleCreator = BundleCreator.empty()
    )

    @IntoMap
    @Provides
    @ScreenKey(ChooseRoleScreenParams::class)
    fun phoneChooseRoleFragment() : NavigationData = NavigationData(
        navId = work.sample.auth.R.id.action_fragment_phone_to_fragment_choose_role,
        bundleCreator = bundleCreateDelegate(ChooseRoleFragment::createBundle)
    )

    @IntoMap
    @Provides
    @ScreenKey(PhoneNameScreenParams::class)
    fun phoneNameFragment() : NavigationData = NavigationData(
        navId = work.sample.auth.R.id.action_fragment_phone_to_fragment_name,
        bundleCreator = bundleCreateDelegate(NameFragment::createPhoneBundle)
    )

    @IntoMap
    @Provides
    @ScreenKey(ChooseRoleNameScreenParams::class)
    fun chooseRoleNameFragment() : NavigationData = NavigationData(
        navId = work.sample.auth.R.id.action_fragment_choose_role_to_fragment_name,
        bundleCreator = bundleCreateDelegate(NameFragment::createChooseRoleBundle)
    )

    @IntoMap
    @Provides
    @ScreenKey(GroupCreateScreenParams::class)
    fun groupListToGroupCreateBottom() : NavigationData = NavigationData(
        navId = work.sample.admin.R.id.action_fragment_groups_to_dialog_group_create,
        bundleCreator = BundleCreator.empty()
    )
}