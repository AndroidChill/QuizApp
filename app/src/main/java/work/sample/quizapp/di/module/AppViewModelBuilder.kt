package work.sample.quizapp.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import work.sample.admin.groupDetail.ui.GroupDetailsViewModel
import work.sample.admin.main.ui.MainViewModel
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

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GroupDetailsViewModel::class)
    abstract fun groupDetailsViewModel(groupDetailsViewModel: GroupDetailsViewModel): ViewModel
}