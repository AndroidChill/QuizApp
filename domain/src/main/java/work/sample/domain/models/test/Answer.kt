package work.sample.domain.models.test

import com.google.gson.annotations.SerializedName

data class Answer(
    var id: Int,
    var title: String,
    @SerializedName("is_right")
    var isRight: Boolean
)