package work.sample.quizapp.di.module.uiBuilder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import work.sample.admin.GroupCreateBottomFragment
import work.sample.admin.groupDetail.ui.GroupDetailFragment
import work.sample.admin.groupRequest.GroupRequestFragment
import work.sample.admin.main.ui.GroupsFragment
import work.sample.admin.testDetail.ui.TestDetailFragment
import work.sample.admin.testHistory.ui.TestHistoryFragment

@Module
interface AdminActivityProvider {

    @ContributesAndroidInjector
    fun groupFragment() : GroupsFragment

    @ContributesAndroidInjector
    fun groupCreateFragment(): GroupCreateBottomFragment

    @ContributesAndroidInjector
    fun groupDetailFragment(): GroupDetailFragment

    @ContributesAndroidInjector
    fun groupRequestFragment(): GroupRequestFragment

    @ContributesAndroidInjector
    fun testDetailFragment(): TestDetailFragment

    @ContributesAndroidInjector
    fun testHistoryFragment(): TestHistoryFragment
}