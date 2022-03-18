package work.sample.auth.phone.ui

import android.annotation.SuppressLint
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.google.android.material.internal.TextWatcherAdapter
import com.redmadrobot.inputmask.MaskedTextChangedListener
import kotlinx.coroutines.launch
import work.sample.auth.phone.PhoneAction
import work.sample.auth.phone.PhoneNews
import work.sample.auth.phone.PhoneState
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.auth.databinding.FragmentPhoneBinding as Binding

class PhoneFragment : BaseFragment<Binding>(), MviView<PhoneState, PhoneNews> {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    val viewModel by lazy {
        viewModelFactory.create(PhoneViewModel::class.java)
    }

    override fun initView() {
        with(binding) {
            val listener = MaskedTextChangedListener("+7 ([000]) [000]-[00]-[00]", etNumber)
            etNumber.addTextChangedListener(listener)
            etNumber.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun afterTextChanged(s: Editable) {
                    val length = s.length
                    if (length < 4) {
                        if (s.length > 1) {
                            s.replace(0, length - 1, "+7 (")
                        }
                    }
                    btnSetPhone.isEnabled = length == 18
                }
            })
        }
    }

    override fun initListener() {
        with(binding) {
            btnSetPhone.setOnClickListener {
                val phone = getCorrectPhone()
                lifecycleScope.launch {
                    viewModel.obtainAction(PhoneAction.AuthCheck(phone))
                }
            }

            imageView2.setOnClickListener {
                viewModel.back()
            }
        }
    }

    private fun getCorrectPhone() =
        binding.etNumber.text.toString().filter {
            it.isDigit() || it == '+'
        }

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@PhoneFragment)
        }
    }

    override fun renderState(state: PhoneState) {
        when(state) {
            is PhoneState.AuthorizeUser -> {
                viewModel.navigatePinCode(getCorrectPhone())
            }
            is PhoneState.UnAuthorizeUser -> {
                viewModel.navigateChooseRole(getCorrectPhone())
            }
        }
    }

    override fun renderNews(news: PhoneNews) {

    }
}