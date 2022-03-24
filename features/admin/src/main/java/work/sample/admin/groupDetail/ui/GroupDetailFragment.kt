package work.sample.admin.groupDetail.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.redmadrobot.inputmask.MaskedTextChangedListener
import kotlinx.coroutines.launch
import work.sample.admin.groupDetail.GroupDetailState
import work.sample.admin.groupDetail.GroupDetailsAction
import work.sample.admin.groupDetail.GroupDetailsNews
import work.sample.admin.groupDetail.ui.users.GroupUserAdapter
import work.sample.admin.groupDetail.ui.users.GroupUserViewHolder
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.ui.MainViewModel
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.navigation.params.screens.admin.GroupDetailScreenParams
import work.sample.admin.databinding.FragmentGroupDetailBinding as Binding

class GroupDetailFragment : BaseFragment<Binding>(), MviView<GroupDetailState, GroupDetailsNews> {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    private lateinit var adapter: GroupUserAdapter

    val viewModel by lazy {
        viewModelFactory.create(GroupDetailsViewModel::class.java)
    }

    override fun initView() {

        adapter = GroupUserAdapter()

        with(binding) {
            tvTitle.text = arguments?.getString(ARGS_GROUP_TITLE) ?: ""
            rvUsers.layoutManager = LinearLayoutManager(context)
            rvUsers.adapter = adapter

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

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@GroupDetailFragment)
        }
        lifecycleScope.launch {
            viewModel.obtainAction(GroupDetailsAction.GroupDetailRequest(arguments?.getInt(
                ARGS_GROUP_ID) ?: 1))
        }
    }


    override fun renderState(state: GroupDetailState) {
        when(state) {
            is GroupDetailState.GroupDetailsSuccess -> {
                adapter.addData(state.data)
            }
        }
    }

    override fun renderNews(news: GroupDetailsNews) {
        TODO("Not yet implemented")
    }

    companion object {

        private const val ARGS_GROUP_ID = "args_group_id"
        private const val ARGS_GROUP_TITLE = "args_title"

        fun createGroupDetailsBundle(data: GroupDetailScreenParams): Bundle = Bundle().apply {
            putString(ARGS_GROUP_TITLE, data.title)
            putInt(
                ARGS_GROUP_ID, data.groupId
            )
        }

    }

}