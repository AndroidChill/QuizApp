package work.sample.auth.name.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.navigation.params.screens.auth.ChooseRoleNameScreenParams
import work.sample.navigation.params.screens.auth.PhoneNameScreenParams
import kotlin.properties.Delegates
import work.sample.auth.databinding.FragmentNameBinding as Binding

class NameFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    private lateinit var phone: String
    private var action by Delegates.notNull<Int>()
    private var roleId by Delegates.notNull<Int>()

    val viewModel by lazy {
        viewModelFactory.create(NameViewModel::class.java)
    }

    override fun initView() {
        phone = arguments?.getString(ARGS_PARAMS_PHONE) ?: ""
        action = arguments?.getInt(ARGS_PARAMS_ACTION) ?: -1
        roleId = arguments?.getInt(ARGS_PARAMS_ROLE_ID) ?: -1
    }

    override fun initListener() {
//        with()
    }

    companion object {

        private const val ARGS_PARAMS_PHONE = "args_phone"
        private const val ARGS_PARAMS_ACTION = "args_action"
        private const val ARGS_PARAMS_ROLE_ID = "args_role_id"

        fun createPhoneBundle(data: PhoneNameScreenParams): Bundle = Bundle().apply {
            putString(ARGS_PARAMS_PHONE, data.phone)
            putInt(ARGS_PARAMS_ACTION, data.action)
        }

        fun createChooseRoleBundle(data: ChooseRoleNameScreenParams): Bundle = Bundle().apply {
            putString(ARGS_PARAMS_PHONE, data.phone)
            putInt(ARGS_PARAMS_ACTION, data.action)
            putInt(ARGS_PARAMS_ROLE_ID, data.roleId)
        }

    }
}