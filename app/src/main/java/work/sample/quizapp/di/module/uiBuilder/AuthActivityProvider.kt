package work.sample.quizapp.di.module.uiBuilder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import work.sample.auth.chooseRole.ChooseRoleFragment
import work.sample.auth.company.CompanyFragment
import work.sample.auth.intro.IntroFragment
import work.sample.auth.name.ui.NameFragment
import work.sample.auth.phone.ui.PhoneFragment
import work.sample.auth.pinCode.ui.PinCodeFragment
import work.sample.auth.signin.SingInFragment
import work.sample.auth.signup.SignUpFragment
import work.sample.auth.sms.SmsFragment

@Module
interface AuthActivityProvider {

//    @ContributesAndroidInjector
//    fun splashFragment(): SplashFragment

    @ContributesAndroidInjector
    fun introFragment(): IntroFragment

    @ContributesAndroidInjector
    fun singInFragment(): SingInFragment

    @ContributesAndroidInjector
    fun signUpFragment(): SignUpFragment

    @ContributesAndroidInjector
    fun chooseRoleFragment(): ChooseRoleFragment

    @ContributesAndroidInjector
    fun companyFragment(): CompanyFragment

    @ContributesAndroidInjector
    fun phoneFragment(): PhoneFragment

    @ContributesAndroidInjector
    fun nameFragment(): NameFragment

    @ContributesAndroidInjector
    fun pinCodeFragment(): PinCodeFragment

    @ContributesAndroidInjector
    fun smsFragment(): SmsFragment
}