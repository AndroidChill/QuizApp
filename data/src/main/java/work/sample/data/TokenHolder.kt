package work.sample.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import work.sample.core.DataState
import work.sample.core.networkException.user.auth.AccessTokenNotSavedException
import java.lang.StringBuilder
import java.util.concurrent.atomic.AtomicReference
import javax.inject.Inject

class TokenHolder @Inject constructor() {

    private val tokenReference = AtomicReference<String>()

    private val prefix = "Bearer"

    fun set(token: String) {
        tokenReference.set(token)
    }

    fun isNotEmptyToken() = get().isNotEmpty()

    fun get(): String {
        return StringBuilder()
            .append(prefix)
            .append(" ")
            .append(
                tokenReference.get() ?: throw AccessTokenNotSavedException("Access token is null")
            ).toString()
    }

    fun release() : Flow<DataState<*>> {
        tokenReference.set(null)
        return flow<DataState<*>> {
            emit(DataState.Empty)
        }
    }

    fun <T> execute(tokenFunction: (String) -> T) : Flow<DataState<T>> {
        return flow<DataState<T>> {
            emit(DataState.Success(tokenFunction(get())))
        }.catch { thr ->
            val err: Throwable = ExceptionsProcessor.processGeneralThrowable(thr)
        }
    }

}