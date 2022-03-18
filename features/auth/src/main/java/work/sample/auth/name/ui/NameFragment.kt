package work.sample.auth.name.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import work.sample.auth.name.NameAction
import work.sample.auth.name.NameNews
import work.sample.auth.name.NameState
import work.sample.auth.phone.PhoneNews
import work.sample.auth.phone.PhoneState
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.navigation.params.screens.auth.ChooseRoleNameScreenParams
import work.sample.navigation.params.screens.auth.PhoneNameScreenParams
import kotlin.properties.Delegates
import work.sample.auth.databinding.FragmentNameBinding as Binding

class NameFragment : BaseFragment<Binding>(), MviView<NameState, NameNews> {

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
        with(binding) {

            ivBack.setOnClickListener {
                viewModel.back()
            }

            etName.addTextChangedListener{
                btnSetName.isEnabled = !it.isNullOrEmpty()
            }

            btnSetName.setOnClickListener {
                val phone: String = arguments?.getString(ARGS_PARAMS_PHONE) ?: ""
                val action: Int = arguments?.getInt(ARGS_PARAMS_ACTION) ?: 0
                val roleId: Int = arguments?.getInt(ARGS_PARAMS_ROLE_ID) ?: -1
                val name: String = etName.text.toString()

                lifecycleScope.launch {
                    if (roleId < 1) {
                        viewModel.obtainAction(NameAction.SignIn(
                            phone, name
                        ))
                    } else{
                        viewModel.obtainAction(NameAction.SignUp(
                            phone, name, roleId
                        ))
                    }
                }


            }
        }
    }

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@NameFragment)
        }
    }

    override fun renderState(state: NameState) {
        when(state) {

        }
    }

    override fun renderNews(news: NameNews) {
        when(news) {

        }
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