package work.sample.admin.groupRequest

import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.admin.databinding.FragmentGroupRequestBinding as Binding

class GroupRequestFragment : BaseFragment<Binding> (){

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

}