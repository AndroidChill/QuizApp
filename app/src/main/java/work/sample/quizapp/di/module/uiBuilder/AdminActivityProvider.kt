package work.sample.quizapp.di.module.uiBuilder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import work.sample.admin.GroupCreateBottomFragment
import work.sample.admin.GroupsFragment

@Module
interface AdminActivityProvider {

    @ContributesAndroidInjector
    fun groupFragment() : GroupsFragment

    @ContributesAndroidInjector
    fun groupCreateFragment(): GroupCreateBottomFragment

}