package work.sample.quizapp.di.module.uiBuilder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import work.sample.admin.AdminActivity
import work.sample.auth.AuthActivity

@Module
interface ActivityBuilder {

    @ContributesAndroidInjector(modules = [AuthActivityProvider::class])
    fun provideAuthActivity(): AuthActivity

    @ContributesAndroidInjector(modules = [AdminActivityProvider::class])
    fun provideAdminActivity(): AdminActivity

}