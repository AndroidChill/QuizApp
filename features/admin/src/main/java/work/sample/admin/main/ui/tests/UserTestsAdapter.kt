package work.sample.admin.main.ui.tests

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import work.sample.admin.databinding.ItemGroupBinding
import work.sample.admin.databinding.ItemUserTestsBinding
import work.sample.admin.main.ui.GroupHolder
import work.sample.admin.main.ui.TestClick
import work.sample.domain.models.GroupBody
import work.sample.domain.models.info.TestPrivate
import work.sample.domain.models.info.TestPublish

class UserTestsAdapter (
    var listener: TestClick
        ): RecyclerView.Adapter<UserTestsViewHolder>() {

    private val publishTest = mutableListOf<TestPublish>()
    private val privateTest = mutableListOf<TestPrivate>()

    fun addPublishData(list: List<TestPublish>) {
        val dataCount = publishTest.size
        publishTest.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount, dataCount + list.size)
    }

    fun addPrivateData(list: List<TestPrivate>) {
        val dataCount = privateTest.size
        privateTest.addAll(dataCount, list)
        notifyItemRangeInserted(dataCount + publishTest.size, dataCount + publishTest.size + list.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserTestsViewHolder {
        val binding = ItemUserTestsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserTestsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserTestsViewHolder, position: Int) {
        if (position >= publishTest.size) {
            holder.fillPrivate(privateTest[position - publishTest.size].title, privateTest[position - publishTest.size].groupTitle)
        } else {
            holder.fillPublish(publishTest[position].title)
        }

        holder.itemView.setOnClickListener {
            var id: Int = 0
            var title: String = ""
            if (position >= publishTest.size) {
                id = privateTest[position - publishTest.size].id
                title = privateTest[position - publishTest.size].title
            } else {
                id = publishTest[position].id
                title = publishTest[position].title
            }
            listener.onClick(id, title)
        }
    }

    override fun getItemCount(): Int {
        return publishTest.size + privateTest.size
    }


}