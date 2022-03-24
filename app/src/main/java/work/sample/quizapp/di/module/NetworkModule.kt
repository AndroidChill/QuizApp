package work.sample.quizapp.di.module

import android.util.Log
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import work.sample.data.service.*
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    companion object {
        private const val BASE_URL = "https://immense-lake-06047.herokuapp.com/"
    }

    @Singleton
    @Provides
    fun provideInterceptors(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)

        builder.addInterceptor(
            HttpLoggingInterceptor { message ->
                Log.d("OkHttp", message)
            }
                .setLevel(HttpLoggingInterceptor.Level.BODY)
        )

        return builder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson) : Retrofit {
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit) : AuthService =
        retrofit.create(AuthService::class.java)

    @Provides
    @Singleton
    fun provideCompanyService(retrofit: Retrofit) : CompanyService =
        retrofit.create(CompanyService::class.java)

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit) : UserService =
        retrofit.create(UserService::class.java)

    @Provides
    @Singleton
    fun provideGroupService(retrofit: Retrofit) : GroupService =
        retrofit.create(GroupService::class.java)

    @Provides
    @Singleton
    fun provideTestService(retrofit: Retrofit) : TestService =
        retrofit.create(TestService::class.java)

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return Gson()
    }

}