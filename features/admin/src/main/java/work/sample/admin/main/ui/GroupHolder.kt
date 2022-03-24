package work.sample.admin.main.ui

import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.domain.models.GroupBody

class GroupHolder(private val binding: ItemGroupBinding) : RecyclerView.ViewHolder(binding.root) {

    fun fill(data: GroupBody) {
        binding.tvTitle.text = data.title
    }

}