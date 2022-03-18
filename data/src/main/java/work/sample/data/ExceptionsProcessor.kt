package work.sample.data

import work.sample.core.networkException.NotInternetConnectionException
import work.sample.core.networkException.TimeoutException
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

object ExceptionsProcessor {

    fun processGeneralThrowable(t: Throwable): Exception {
        return when (t) {
            is SocketTimeoutException -> TimeoutException(t)
            is IOException -> NotInternetConnectionException(t)
            is UnknownHostException -> NotInternetConnectionException(t)
            else -> t as Exception
        }
    }

}