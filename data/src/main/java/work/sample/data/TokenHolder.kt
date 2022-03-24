package work.sample.data

import android.content.SharedPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.core.networkException.user.auth.AccessTokenNotSavedException
import java.lang.StringBuilder
import java.util.concurrent.atomic.AtomicReference
import javax.inject.Inject

class TokenHolder @Inject constructor() {

    @Inject
    lateinit var tokenReference: SharedPreferences

//    private val tokenReference = AtomicReference<String>()

    private val prefix = "Bearer"

    fun set(token: String) {
        tokenReference.edit().putString("token", token).apply()
    }

    fun isNotEmptyToken() = (tokenReference.getString("token", "") ?: "").isNotEmpty()

    fun get(): String {
        return StringBuilder()
            .append(prefix)
            .append(" ")
            .append(tokenReference.getString("token", ""))
            .toString()
    }

    fun release() : Flow<DataState<*>> {
        tokenReference.edit().clear().apply()
        return flow<DataState<*>> {
            emit(DataState.Empty)
        }
    }

    fun <T> execute(tokenFunction: (String) -> T) : Flow<DataState<T>> {
        return flow<DataState<T>> {
            emit(DataState.Success(tokenFunction(get())))
        }.catch { thr ->
            val err: Throwable = ExceptionsProcessor.processGeneralThrowable(thr)
        }.flowOn(Dispatchers.IO)
    }

}