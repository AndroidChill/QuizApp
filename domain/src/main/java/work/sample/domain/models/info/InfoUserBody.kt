package work.sample.domain.models.info

import com.google.gson.annotations.SerializedName
import work.sample.domain.models.CompanyBody

data class InfoUserBody(
    val user: User,
    val tests: Tests
)

data class User(
    val name: String,
    val phone: String,
    val company: CompanyBody,
    @SerializedName("role_id")
    val roleId: Int
)


data class TestPublish(
    val id: String,
    val title: String
)

data class TestPrivate(
    val id: String,
    val title: String,
    @SerializedName("group_title")
    val groupTitle: String
)

data class Tests(
    val private: List<TestPrivate>,
    val publish: List<TestPublish>
)