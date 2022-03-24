package work.sample.auth.intro

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import work.sample.auth.databinding.FragmentIntroBinding as Binding
import work.sample.core.BaseFragment
import work.sample.core.DataState
import work.sample.domain.usecase.AuthCheckUseCase
import work.sample.navigation.Router
import work.sample.navigation.params.screens.auth.PhoneScreenParams
import javax.inject.Inject

class IntroFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var authCheckUseCase: AuthCheckUseCase

    override fun onAttach(context: Context) {
        super.onAttach(context)
        lifecycleScope.launch {
            authCheckUseCase.checkToken().collect{
                if (it is DataState.Success && it.data) {
                    requireActivity().startActivity(router.getAdminIntent())
                }
            }
        }

    }

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