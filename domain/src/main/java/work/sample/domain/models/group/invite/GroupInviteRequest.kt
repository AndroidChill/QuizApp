package work.sample.domain.models.group.invite

import com.google.gson.annotations.SerializedName

data class GroupInviteRequest(
    @SerializedName("group_id")
    val groupId: Int,
    val phone: String
)