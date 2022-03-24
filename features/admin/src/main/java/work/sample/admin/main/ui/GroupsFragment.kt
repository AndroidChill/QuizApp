package work.sample.admin.main.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.MainStore
import work.sample.admin.main.ui.tests.UserTestsAdapter
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.navigation.Router
import work.sample.navigation.params.screens.admin.GroupCreateScreenParams
import javax.inject.Inject
import work.sample.admin.databinding.FragmentGroupsBinding as Binding

class GroupsFragment : BaseFragment<Binding>(), MviView<MainState, MainNews>, GroupClick {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    val viewModel by lazy {
        viewModelFactory.create(MainViewModel::class.java)
    }

    private lateinit var adapterGroup: GroupAdapter
    private lateinit var adapterTest: UserTestsAdapter

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@GroupsFragment)
        }
        lifecycleScope.launch {
            viewModel.obtainAction(MainAction.InfoUser)
        }
    }

    override fun initView() {

        adapterGroup = GroupAdapter(this)
        adapterTest = UserTestsAdapter()

        with(binding) {
            btnAddGroup.setOnClickListener {
                viewModel.navigateToCreateGroup()
            }
            btnGroupsRequest.setOnClickListener {
                viewModel.navigateToRequestGroup()
            }
            rvGroups.layoutManager = LinearLayoutManager(context)
            rvGroups.adapter = adapterGroup

            rvTests.layoutManager = LinearLayoutManager(context)
            rvTests.adapter = adapterTest
        }
    }

    override fun initListener() {

    }

    override fun renderState(state: MainState) {
        when(state) {
            is MainState.InfoUserLoading -> {
                with(binding) {
                    pbMain.visibility = View.VISIBLE
                    clContent.visibility = View.GONE
                }
            }
            is MainState.InfoUserShow -> {
                with(binding) {
                    pbMain.visibility = View.GONE
                    clContent.visibility = View.VISIBLE
                    tvName.text = state.data.user.name
                    tvCompanyName.text = state.data.user.company.title
                    tvCompanyAddress.text = state.data.user.company.address

                    if (state.data.user.roleId != 2) {
                        btnAddGroup.visibility = View.GONE
                    }
                }

                adapterGroup.addData(state.data.user.company.groups)
                adapterTest.addPublishData(state.data.tests.publish)
                adapterTest.addPrivateData(state.data.tests.private)
            }
        }
    }

    override fun renderNews(news: MainNews) {

    }

    override fun onClickGroup(groupId: Int, title: String) {
        viewModel.navigateToDetailsGroup(groupId, title)
    }
}