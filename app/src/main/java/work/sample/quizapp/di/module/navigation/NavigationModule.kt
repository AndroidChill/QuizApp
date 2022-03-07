package work.sample.quizapp.di.module.navigation

import dagger.Binds
import dagger.Module
import work.sample.navigation.ActionResolver
import work.sample.navigation.Router
import work.sample.navigation.ScreenFactory
import work.sample.navigation.ScreenResolver
import work.sample.quizapp.navigation.ActionResolverImpl
import work.sample.quizapp.navigation.RouterImpl
import work.sample.quizapp.navigation.ScreenFactoryImpl
import work.sample.quizapp.navigation.ScreenResolverImpl
import javax.inject.Singleton

@Module
interface NavigationModule {

    @Binds
    @Singleton
    fun ScreenResolverImpl.bindScreenResolver(): ScreenResolver

    @Binds
    @Singleton
    fun ScreenFactoryImpl.bindScreenFactory(): ScreenFactory

    @Binds
    @Singleton
    fun ActionResolverImpl.bindActionResolver(): ActionResolver

    @Binds
    @Singleton
    fun RouterImpl.bindRouter(): Router

}