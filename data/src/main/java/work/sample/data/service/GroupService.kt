package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.domain.models.UserBody
import work.sample.domain.models.group.create.GroupCreateRequest
import work.sample.domain.models.group.create.GroupCreateResponse
import work.sample.domain.models.group.invite.GroupInviteRequest
import work.sample.domain.models.group.invite.GroupInviteResponse
import work.sample.domain.models.group.invite.active.InviteActiveRequest
import work.sample.domain.models.group.invite.active.InviteActiveResponse
import work.sample.domain.models.group.invite.list.InviteListResponse

interface GroupService {

    @POST("main/group/detail")
    suspend fun groupDetail(@Header("Authorization") token: String, @Body request: GroupDetailsRequest) : List<UserBody>

    @POST("group/create")
    suspend fun groupCreate(@Header("Authorization") token: String, @Body request: GroupCreateRequest) : GroupCreateResponse

    @POST("main/group/invite")
    suspend fun groupInvite(@Header("Authorization") token: String, @Body request: GroupInviteRequest) : GroupInviteResponse

    @GET("main/group/list")
    suspend fun groupInviteList(@Header("Authorization") token: String) : List<InviteListResponse>

    @POST("main/group/active")
    suspend fun groupInviteActive(@Header("Authorization") token: String, @Body request: InviteActiveRequest) : InviteActiveResponse
}