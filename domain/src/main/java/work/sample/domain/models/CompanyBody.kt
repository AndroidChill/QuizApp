package work.sample.domain.models

data class CompanyBody(
    val title: String,
    val address: String,
    val groups: List<GroupBody>?
)