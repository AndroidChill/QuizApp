package work.sample.admin.testHistory.ui.adapters

import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemHistoryAllBinding
import work.sample.domain.models.testHistory.TestHistoryAllResponse

class TestHistoryAllViewHolder(val binding: ItemHistoryAllBinding)
    : RecyclerView.ViewHolder(binding.root) {

        fun fill(data: TestHistoryAllResponse) {
            with(binding) {
                tvTitle.text = data.title
                tvTime.text = data.datetime
                tvPercent.text = "${data.percentRight} %"
                tvUser.text = "${data.userName} - ${data.userPhone}"
            }
        }

}