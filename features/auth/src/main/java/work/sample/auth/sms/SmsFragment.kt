package work.sample.auth.sms

import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.auth.databinding.FragmentSmsBinding as Binding

class SmsFragment : BaseFragment<Binding> (){

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

}