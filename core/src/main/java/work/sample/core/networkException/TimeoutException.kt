package work.sample.core.networkException

class TimeoutException(cause: Throwable?) : DomainException(cause) {

    override val message = "Ошибка сервера. Повторите попытку позже."
}