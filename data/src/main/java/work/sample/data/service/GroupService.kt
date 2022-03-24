package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.domain.models.UserBody

interface GroupService {

    @POST("main/group/detail")
    suspend fun groupDetail(@Header("Authorization") token: String, @Body request: GroupDetailsRequest) : List<UserBody>

}