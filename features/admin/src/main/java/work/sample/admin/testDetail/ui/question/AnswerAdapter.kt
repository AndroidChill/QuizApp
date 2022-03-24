package work.sample.admin.testDetail.ui.question

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemAnswerBinding
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.admin.main.ui.GroupHolder
import work.sample.domain.models.GroupBody
import work.sample.domain.models.test.Answer

class AnswerAdapter(
    var listener: AnswerClick
) : RecyclerView.Adapter<AnswerViewHolder>() {

    private var data = mutableListOf<Answer>()

    fun addData(list: List<Answer>) {
        val dataCount = data.size
        data.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount, dataCount + list.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerViewHolder {
        val binding = ItemAnswerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnswerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnswerViewHolder, position: Int) {
        holder.fill(data[position].title ?: "")

        holder.itemView.setOnClickListener {
            listener.onClick(data[position].isRight)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}