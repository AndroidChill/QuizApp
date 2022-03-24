package work.sample.admin.groupDetail.ui.users

import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupDetailUserBinding
import work.sample.domain.models.UserBody

class GroupUserViewHolder(private val binding: ItemGroupDetailUserBinding)
    : RecyclerView.ViewHolder(binding.root){

        fun fill(data: UserBody) {
            with(binding) {
                tvName.text = data.username
                tvPhone.text = data.phone
            }
        }

}