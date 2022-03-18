package work.sample.data.models.auth.signup

import com.google.gson.annotations.SerializedName

data class SignUpRequest(
    val phone: String,
    val name: String,
    @SerializedName("role_id")
    val roleId: Int
)
