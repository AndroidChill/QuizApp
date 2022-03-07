package work.sample.quizapp.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import work.sample.core.ViewModelFactory
import work.sample.data.RepositoryModule
import work.sample.quizapp.QuizApp
import work.sample.quizapp.di.module.AppModule
import work.sample.quizapp.di.module.NetworkModule
import work.sample.quizapp.di.module.ViewModelBuilder
import work.sample.quizapp.di.module.navigation.NavigationModule
import work.sample.quizapp.di.module.navigation.NavigationScreenMapModule
import work.sample.quizapp.di.module.uiBuilder.ActivityBuilder
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ActivityBuilder::class,
        ViewModelBuilder::class,
        RepositoryModule::class,
        NetworkModule::class,
        NavigationModule::class,
        NavigationScreenMapModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface AppComponent : AndroidInjector<QuizApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

}