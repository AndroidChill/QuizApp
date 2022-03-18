package work.sample.core.networkException.user.auth

import work.sample.core.networkException.DomainException

abstract class AuthException : DomainException {
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)
}