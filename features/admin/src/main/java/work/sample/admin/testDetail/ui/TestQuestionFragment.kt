package work.sample.admin.testDetail.ui

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import work.sample.admin.databinding.FragmentTestQuestionBinding
import work.sample.admin.testDetail.ui.question.AnswerAdapter
import work.sample.admin.testDetail.ui.question.AnswerClick
import work.sample.domain.models.test.Answer
import work.sample.domain.models.test.Question
import work.sample.navigation.params.screens.test.TestDetailScreenParams
import java.io.Serializable
import java.util.ArrayList

class TestQuestionFragment : Fragment(), AnswerClick {

    private lateinit var binding: FragmentTestQuestionBinding

    var answers = mutableListOf<Answer>()
    private lateinit var adapter : AnswerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestQuestionBinding.inflate(inflater,container,false)

        adapter = AnswerAdapter(this)
        binding.tvTitle.text = arguments?.getString(ARGS_Question_title) ?: ""
        answers = arguments?.getParcelableArrayList<Answer>(ARGS_Answer)!!.toMutableList()

        binding.rvAnswer.layoutManager = LinearLayoutManager(context)
        binding.rvAnswer.adapter = adapter

        adapter.addData(answers)

        return binding.root
    }

    companion object {

        private const val ARGS_Question_title = "args_question_title"
        private const val ARGS_Answer = "args_answer"
        val CALLBACK_FUNCTION: String = "CALLBACK_FUNCTION"

        fun newInstance(data: Question, func : (Boolean) -> Unit) = TestQuestionFragment().apply {
            arguments = Bundle(2).apply {
                putString(ARGS_Question_title, data.title)
                putSerializable(CALLBACK_FUNCTION, func as Serializable)
                putParcelableArrayList(ARGS_Answer, data.answers as ArrayList<Answer>)
            }

        }

    }

    override fun onClick(result: Boolean) {
        val callback: (Boolean) -> Unit = arguments?.getSerializable(CALLBACK_FUNCTION) as (Boolean) -> Unit
        callback.invoke(result)
    }

}