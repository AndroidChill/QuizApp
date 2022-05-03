package work.sample.domain.models.group.invite.active

import com.google.gson.annotations.SerializedName

data class InviteActiveRequest(
    @SerializedName("group_id")
    val groupId: Int,
    @SerializedName("is_reject")
    val isReject: Boolean
)
