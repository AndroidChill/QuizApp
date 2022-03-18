package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.POST
import work.sample.data.models.authCheck.AuthCheckRequest
import work.sample.data.models.authCheck.AuthCheckResponse
import work.sample.data.models.signIn.SignInRequest
import work.sample.data.models.signIn.SignInResponse
import work.sample.data.models.signUp.SignUpRequest
import work.sample.data.models.signUp.SignUpResponse

interface AuthService {

    @POST("auth/check")
    suspend fun authCheck(@Body request: AuthCheckRequest) : AuthCheckResponse

    @POST("auth/signin")
    suspend fun signIn(@Body request: SignInRequest) : SignInResponse

    @POST("auth/signup")
    suspend fun signUp(@Body request: SignUpRequest) : SignUpResponse


}
