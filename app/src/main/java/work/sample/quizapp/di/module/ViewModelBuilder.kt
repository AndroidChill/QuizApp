package work.sample.quizapp.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import work.sample.core.ViewModelFactory

@Module(
    includes = [
        AppViewModelBuilder::class
    ]
)
interface ViewModelBuilder {

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}