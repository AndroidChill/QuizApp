package work.sample.quizapp.di.module.uiBuilder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import work.sample.admin.AdminActivity
import work.sample.admin.main.MainAction
import work.sample.auth.AuthActivity
import work.sample.quizapp.MainActivity

@Module
interface ActivityBuilder {

    @ContributesAndroidInjector
    fun provideMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AuthActivityProvider::class])
    fun provideAuthActivity(): AuthActivity

    @ContributesAndroidInjector(modules = [AdminActivityProvider::class])
    fun provideAdminActivity(): AdminActivity

}