package work.sample.domain.models.saveTest

import com.google.gson.annotations.SerializedName

data class SaveTestRequest(
    @SerializedName("test_id")
    val testId: Int,
    @SerializedName("percent_right")
    val percentRight: Int
)