package work.sample.admin

import android.view.LayoutInflater
import android.view.ViewGroup
import work.sample.core.BaseFragment
import work.sample.navigation.Router
import work.sample.navigation.params.screens.admin.GroupCreateScreenParams
import javax.inject.Inject
import work.sample.admin.databinding.FragmentGroupsBinding as Binding

class GroupsFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var router: Router

    override fun initView() {
        with(binding) {
            textView.setOnClickListener {
                router.navigate(GroupCreateScreenParams)
            }
        }
    }
}