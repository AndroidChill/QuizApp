package work.sample.domain.models.testHistory

import com.google.gson.annotations.SerializedName

data class TestHistoryAllResponse(
    var title: String,
    @SerializedName("percent_right")
    var percentRight: Int,
    var datetime: String,
    @SerializedName("user_phone")
    var userPhone: String,
    @SerializedName("user_name")
    var userName: String
)
