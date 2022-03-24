package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse

interface TestService {

    @POST("main/test/detail")
    suspend fun testDetail(@Header("Authorization") token: String, @Body request: TestDetailRequest) : TestDetailResponse

}