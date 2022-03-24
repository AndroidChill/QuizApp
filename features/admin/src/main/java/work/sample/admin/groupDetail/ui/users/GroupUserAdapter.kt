package work.sample.admin.groupDetail.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.admin.databinding.ItemGroupDetailUserBinding
import work.sample.admin.main.ui.GroupHolder
import work.sample.domain.models.UserBody

class GroupUserAdapter : RecyclerView.Adapter<GroupUserViewHolder>() {

    private val data = mutableListOf<UserBody>()

    fun addData(list: List<UserBody>) {
        val dataCount = data.size
        data.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount, dataCount + list.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupUserViewHolder {
        val binding = ItemGroupDetailUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupUserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupUserViewHolder, position: Int) {
        holder.fill(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}