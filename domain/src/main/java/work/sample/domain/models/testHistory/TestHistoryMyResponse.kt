package work.sample.domain.models.testHistory

import com.google.gson.annotations.SerializedName

data class TestHistoryMyResponse(
    var title: String,
    @SerializedName("percent_right")
    var percentRight: Int,
    var datetime: String
)