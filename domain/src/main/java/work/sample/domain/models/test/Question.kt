package work.sample.domain.models.test

data class Question(
    val id: Int,
    val title: String,
    val answers: List<Answer>
)