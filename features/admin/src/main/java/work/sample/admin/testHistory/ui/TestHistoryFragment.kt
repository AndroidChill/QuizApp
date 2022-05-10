package work.sample.admin.testHistory.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.ui.MainViewModel
import work.sample.admin.testHistory.TestHistoryAction
import work.sample.admin.testHistory.TestHistoryNews
import work.sample.admin.testHistory.TestHistoryState
import work.sample.admin.testHistory.ui.adapters.TestHistoryAllAdapter
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.domain.models.testHistory.toAllResponse
import work.sample.navigation.params.screens.test.TestHistoryScreenParams
import work.sample.admin.databinding.FragmentHistoryBinding as Binding

class TestHistoryFragment : BaseFragment<Binding>(), MviView<TestHistoryState, TestHistoryNews> {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    val viewModel by lazy {
        viewModelFactory.create(TestHistoryViewModel::class.java)
    }

    private lateinit var adapterAll : TestHistoryAllAdapter

    override fun initView() {
        with(binding) {
            adapterAll = TestHistoryAllAdapter()
            rvHistoryAll.layoutManager = LinearLayoutManager(context)
            rvHistoryAll.adapter = adapterAll
        }
    }

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@TestHistoryFragment)
        }
        lifecycleScope.launch {
            if (arguments?.getInt(ARGS_ROLE_ID) != 1) {
                viewModel.obtainAction(TestHistoryAction.TestHistoryMy)
            } else {
                viewModel.obtainAction(TestHistoryAction.TestHistoryAll)
            }

        }
    }

    override fun renderState(state: TestHistoryState) {
        when (state) {
            is TestHistoryState.TestHistoryAllSuccess -> {
                adapterAll.addData(state.data)
            }

            is TestHistoryState.TestHistoryMySuccess -> {
                adapterAll.addData(state.data.toAllResponse())
            }
        }
    }

    override fun renderNews(news: TestHistoryNews) {
        TODO("Not yet implemented")
    }


    companion object {

        private const val ARGS_ROLE_ID = "args_test_id"

        fun createTestHistoryBundle(data: TestHistoryScreenParams): Bundle = Bundle().apply {
            putInt(ARGS_ROLE_ID, data.roleId)
        }

    }

}