package work.sample.data.service

import retrofit2.http.GET
import retrofit2.http.Header
import work.sample.domain.models.info.InfoUserBody

interface UserService {

    @GET("main/info")
    suspend fun infoUser(@Header("Authorization") token: String) : InfoUserBody

}