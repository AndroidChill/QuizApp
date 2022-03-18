package work.sample.quizapp.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import work.sample.auth.name.ui.NameViewModel
import work.sample.auth.phone.ui.PhoneViewModel
import work.sample.quizapp.di.qualifier.ViewModelKey

@Module
abstract class AppViewModelBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(PhoneViewModel::class)
    abstract fun phoneViewModel(phoneViewModel: PhoneViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NameViewModel::class)
    abstract fun nameViewModel(nameViewModel: NameViewModel): ViewModel
}