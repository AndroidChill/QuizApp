package work.sample.admin.main.ui.tests

import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemUserTestsBinding

class UserTestsViewHolder(private val binding: ItemUserTestsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun fillPublish(title: String) {
        with(binding) {
            tvTitle.text = title
        }
    }

    fun fillPrivate(title: String, titleGroup: String) {
        with(binding) {
            tvTitle.text = title
            tvAccess.text = "Для группы - $titleGroup"
        }
    }

}