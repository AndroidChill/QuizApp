package work.sample.data.models.group.deatils

import com.google.gson.annotations.SerializedName

data class GroupDetailsRequest(
    @SerializedName("group_id")
    val groupId: Int
)
