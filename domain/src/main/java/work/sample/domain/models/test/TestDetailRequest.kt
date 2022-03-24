package work.sample.domain.models.test

import com.google.gson.annotations.SerializedName

data class TestDetailRequest(
    @SerializedName("test_id")
    var testId: Int
)
