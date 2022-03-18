package work.sample.core.networkException

class NotInternetConnectionException(cause: Throwable?): DomainException(cause) {

    override val message = "Отсутствует интернет соединение"
}