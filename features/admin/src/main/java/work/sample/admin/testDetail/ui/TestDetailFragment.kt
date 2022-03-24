package work.sample.admin.testDetail.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import work.sample.admin.R
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.ui.MainViewModel
import work.sample.admin.testDetail.TestDetailAction
import work.sample.admin.testDetail.TestDetailNews
import work.sample.admin.testDetail.TestDetailState
import work.sample.core.BaseFragment
import work.sample.core.mvi.MviView
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.test.Question
import work.sample.navigation.params.screens.test.TestDetailScreenParams
import work.sample.admin.databinding.FragmentTestDetailBinding as Binding

class TestDetailFragment : BaseFragment<Binding>(), MviView<TestDetailState, TestDetailNews> {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    val viewModel by lazy {
        viewModelFactory.create(TestDetailViewModel::class.java)
    }

    override fun bindViewModel() {
        with(viewModel) {
            bind(viewLifecycleOwner.lifecycleScope, this@TestDetailFragment)
        }
        lifecycleScope.launch {
            viewModel.obtainAction(
                TestDetailAction.TestDetail(
                    arguments?.getInt(ARGS_TEST_ID) ?: 0
                )
            )
        }
    }

    override fun initView() {
        binding.textView8.text = arguments?.getString(ARGS_TEST_TITLE) ?: ""
    }

    private var test = mutableListOf<Question>()
    private var count = 0
    private var percentTrue = 100
    private var percentCount = 0

    override fun renderState(state: TestDetailState) {
        when (state) {
            is TestDetailState.TestDetailSuccess -> {
                test = state.test.questions.toMutableList()
                percentCount = 100 / test.size
                changeFragment(false)
            }
            is TestDetailState.TestSaveSuccess -> {
                Toast.makeText(context, "Прохождение теста успешно сохранено", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun renderNews(news: TestDetailNews) {
        TODO("Not yet implemented")
    }

    fun changeFragment(result: Boolean) {

        binding.pBar.progress = (((count + 1).toFloat() / (test.size).toFloat()) * 100).toInt()

        if (count != 0 && !result) {
            percentTrue -= percentCount
        }

        if (count >= test.size) {
            lifecycleScope.launch {
                viewModel.obtainAction(TestDetailAction.TestSave(SaveTestRequest(
                    testId = arguments?.getInt(ARGS_TEST_ID) ?: 0,
                    percentRight = percentTrue
                )))
            }
            binding.frameContainer.visibility = View.GONE
            binding.tvResult.visibility = View.VISIBLE
            binding.tvResult.text = "Поздравляю вы верно ответили на $percentTrue % вопросов"
        } else {
            binding.tvCount.text = "${count + 1}/${test.size}"
            parentFragmentManager.beginTransaction()
                .replace(
                    R.id.frame_container, TestQuestionFragment.newInstance(
                        test[count]
                    ) {
                        changeFragment(it)
                    }
                )
                .commit()
        }

        count++

    }

    companion object {

        private const val ARGS_TEST_ID = "args_test_id"
        private const val ARGS_TEST_TITLE = "args_test_title"

        fun createTestDetailsBundle(data: TestDetailScreenParams): Bundle = Bundle().apply {
            putInt(ARGS_TEST_ID, data.testId)
            putString(ARGS_TEST_TITLE, data.testTitle)
        }

    }

}