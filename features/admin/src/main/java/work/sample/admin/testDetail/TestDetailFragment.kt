package work.sample.admin.testDetail

import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.admin.databinding.FragmentTestDetailBinding as Binding

class TestDetailFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

}