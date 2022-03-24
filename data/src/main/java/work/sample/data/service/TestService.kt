package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import work.sample.domain.models.saveTest.SaveTestRequest
import work.sample.domain.models.saveTest.SaveTestResponse
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.models.test.TestDetailResponse
import work.sample.domain.models.testHistory.TestHistoryAllResponse
import work.sample.domain.models.testHistory.TestHistoryMyResponse

interface TestService {

    @POST("main/test/detail")
    suspend fun testDetail(@Header("Authorization") token: String, @Body request: TestDetailRequest) : TestDetailResponse

    @POST("main/test/save")
    suspend fun testSave(@Header("Authorization") token: String, @Body request: SaveTestRequest) : SaveTestResponse

    @GET("main/test/history/all")
    suspend fun historyAllTest(@Header("Authorization") token: String) : List<TestHistoryAllResponse>

    @GET("main/test/history/my")
    suspend fun historyMyTest(@Header("Authorization") token: String) : List<TestHistoryMyResponse>

}