package work.sample.domain.models.testHistory

import com.google.gson.annotations.SerializedName

data class TestHistoryMyResponse(
    var title: String,
    @SerializedName("percent_right")
    var percentRight: Int,
    var datetime: String
)

fun List<TestHistoryMyResponse>.toAllResponse() : List<TestHistoryAllResponse> {
    return this.map {
        TestHistoryAllResponse(
            title = it.title,
            percentRight = it.percentRight,
            datetime = it.datetime,
            userPhone = "",
            userName = ""
        )
    }
}