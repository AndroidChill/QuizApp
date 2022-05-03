package work.sample.admin.groupRequest

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.admin.databinding.ItemGroupRequestBinding
import work.sample.admin.main.ui.GroupHolder
import work.sample.domain.models.group.invite.list.InviteListResponse

class GroupRequestAdapter(
    val listener: GroupRequestClick
) : RecyclerView.Adapter<GroupRequestViewHolder>() {

    private val data = mutableListOf<InviteListResponse>()

    fun addItems(data:List<InviteListResponse>){
        val count = this.data.size
        this.data.addAll(count, data)
        notifyDataSetChanged()
    }

    fun deleteItem(groupId: Int) {
        val item  = data.find {
            it.id == groupId
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            data.removeIf {
                it.id == groupId
            }
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupRequestViewHolder {
        val binding = ItemGroupRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupRequestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupRequestViewHolder, position: Int) {
        holder.binding.tvName.text = data[position].title
        holder.binding.btnEnable.setOnClickListener {
            listener.onClick(true, data[position].id)
        }
        holder.binding.btnDisable.setOnClickListener {
            listener.onClick(false, data[position].id)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}