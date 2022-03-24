package work.sample.admin.testDetail.ui.question

import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemAnswerBinding

class AnswerViewHolder(val binding: ItemAnswerBinding)
    : RecyclerView.ViewHolder(binding.root) {

        fun fill(title: String) {
            binding.tvTitle.text = title
        }

}