package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.POST
import work.sample.data.models.authCheck.AuthCheckRequest
import work.sample.data.models.authCheck.AuthCheckResponse

interface AuthService {

    @POST("auth/check")
    suspend fun authCheck(@Body request: AuthCheckRequest) : AuthCheckResponse

}