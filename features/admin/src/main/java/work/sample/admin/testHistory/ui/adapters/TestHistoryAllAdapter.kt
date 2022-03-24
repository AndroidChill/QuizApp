package work.sample.admin.testHistory.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.admin.databinding.ItemHistoryAllBinding
import work.sample.admin.main.ui.GroupHolder
import work.sample.domain.models.GroupBody
import work.sample.domain.models.testHistory.TestHistoryAllResponse

class TestHistoryAllAdapter : RecyclerView.Adapter<TestHistoryAllViewHolder>() {

    private val data = mutableListOf<TestHistoryAllResponse>()

    fun addData(list: List<TestHistoryAllResponse>) {
        val dataCount = data.size
        data.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount, dataCount + list.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHistoryAllViewHolder {
        val binding = ItemHistoryAllBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestHistoryAllViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TestHistoryAllViewHolder, position: Int) {
        holder.fill(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}