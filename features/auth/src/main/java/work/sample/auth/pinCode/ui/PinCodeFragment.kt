package work.sample.auth.pinCode.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import work.sample.auth.R
import work.sample.core.BaseFragment
import work.sample.navigation.params.screens.auth.PinCodeScreenParams
import work.sample.auth.databinding.FragmentPinCodeBinding as Binding

class PinCodeFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate



    companion object {

        private const val ARGS_PARAMS_PHONE = "args_phone"

        var COLOR_GRAY_ID = work.sample.resources.R.color.grey_point_code
        var COLOR_ACCENT_ID = work.sample.resources.R.color.accent
        var COLOR_ERROR_ID = work.sample.resources.R.color.error

        fun createBundle(data: PinCodeScreenParams): Bundle = Bundle().apply {
            putString(ARGS_PARAMS_PHONE, data.phone)
        }

    }

}