package work.sample.admin.testHistory.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemHistoryAllBinding
import work.sample.domain.models.testHistory.TestHistoryAllResponse

class TestHistoryAllViewHolder(val binding: ItemHistoryAllBinding)
    : RecyclerView.ViewHolder(binding.root) {

        fun fill(data: TestHistoryAllResponse) {
            with(binding) {
                tvTitle.text = data.title
                tvTime.text = data.datetime
                tvPercent.text = "${data.percentRight / 10} / 10"
                if (data.userPhone.isEmpty()) {
                    tvUser.visibility = View.GONE
                } else {
                    tvUser.text = "${data.userName} - ${data.userPhone}"
                }

            }
        }

}