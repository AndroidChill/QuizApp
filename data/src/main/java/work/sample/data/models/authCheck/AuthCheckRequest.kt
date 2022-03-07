package work.sample.data.models.authCheck

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AuthCheckRequest(
    @SerializedName("phone")
    @Expose
    val phone: String
)