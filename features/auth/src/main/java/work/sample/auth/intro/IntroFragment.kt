package work.sample.auth.intro

import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.auth.databinding.FragmentIntroBinding as Binding
import work.sample.core.BaseFragment
import work.sample.navigation.Router
import work.sample.navigation.params.screens.auth.PhoneScreenParams
import javax.inject.Inject

class IntroFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var router: Router

    override fun initView() {

        with(binding) {
            btnStarted.setOnClickListener {
                router.navigate(
                    data = PhoneScreenParams
                )
            }
        }


    }

}