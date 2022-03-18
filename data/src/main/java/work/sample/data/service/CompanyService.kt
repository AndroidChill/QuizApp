package work.sample.data.service

import retrofit2.http.Body
import retrofit2.http.POST
import work.sample.data.models.companyCreate.CompanyCreateRequest
import work.sample.data.models.companyCreate.CompanyCreateResponse

interface CompanyService {

    @POST("company")
    suspend fun companyCreate(@Body request: CompanyCreateRequest) : CompanyCreateResponse

}