package work.sample.auth.chooseRole

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.navigation.Router
import work.sample.navigation.params.screens.auth.ChooseRoleScreenParams
import work.sample.navigation.params.screens.auth.ChooseRoleNameScreenParams
import javax.inject.Inject
import work.sample.auth.databinding.FragmentChooseRoleBinding as Binding

class ChooseRoleFragment : BaseFragment<Binding>(){

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var router: Router

    override fun initListener() {
        with(binding) {
            btnChild.setOnClickListener {
                router.navigate(
                    ChooseRoleNameScreenParams(
                        0,
                        arguments?.getString(ARGS_PARAMS_PHONE) ?: "",
                        0
                    )
                )
            }
            btnParent.setOnClickListener {
                router.navigate(
                    ChooseRoleNameScreenParams(
                        0,
                        arguments?.getString(ARGS_PARAMS_PHONE) ?: "",
                        1
                    )
                )
            }
        }
    }

    companion object {

        private const val ARGS_PARAMS_PHONE = "args_phone"

        fun createBundle(data: ChooseRoleScreenParams): Bundle = Bundle().apply {
            putString(ARGS_PARAMS_PHONE, data.phone)
        }

    }

}