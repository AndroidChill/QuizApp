package work.sample.admin.main.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.R
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.domain.models.GroupBody

class GroupAdapter(
    val listener: GroupClick
) : RecyclerView.Adapter<GroupHolder>() {

    private val data = mutableListOf<GroupBody>()

    fun addData(list: List<GroupBody>) {
        val dataCount = data.size
        data.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount, dataCount + list.size)
    }

    fun clearData() {
        data.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupHolder {
        val binding = ItemGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupHolder, position: Int) {
        holder.fill(data[position])
        holder.itemView.setOnClickListener {
            listener.onClickGroup(data[position].id, data[position].title)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}