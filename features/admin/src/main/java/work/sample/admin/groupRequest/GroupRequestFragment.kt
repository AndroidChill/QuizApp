package work.sample.admin.groupRequest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import work.sample.core.BaseFragment
import work.sample.core.DataState
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.usecase.GroupUseCase
import javax.inject.Inject
import work.sample.admin.databinding.FragmentGroupRequestBinding as Binding

class GroupRequestFragment : BaseFragment<Binding> (), GroupRequestClick{

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var groupUseCase: GroupUseCase

    lateinit var adapter: GroupRequestAdapter

    override fun initView() {

        lifecycleScope.launch {

            adapter = GroupRequestAdapter(this@GroupRequestFragment)
            with(binding) {
                rvRequest.layoutManager = LinearLayoutManager(context)
                rvRequest.adapter = adapter
            }

            groupUseCase.groupInviteList().collect {
                when (it) {
                    is DataState.Success -> {
                        adapter.addItems(it.data.filter { item -> item.status == 1 })
                    }
                }
            }
        }
    }

    override fun onClick(isReject: Boolean, groupId: Int) {
        lifecycleScope.launch {
            groupUseCase.inviteActive(InviteActiveRequest(groupId, isReject))
                .collect {
                    when(it) {
                        is DataState.Success -> {
                            adapter.deleteItem(groupId)
                        }
                    }
                }
        }
    }

}