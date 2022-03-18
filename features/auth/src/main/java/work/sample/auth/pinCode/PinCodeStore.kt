package work.sample.auth.pinCode

import work.sample.auth.pinCode.middleware.PinCodeMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.AuthorizeUseCase
import javax.inject.Inject

class PinCodeStore @Inject constructor(
    authorizeUseCase: AuthorizeUseCase
) : Store<PinCodeState, PinCodeAction, PinCodeNews>(authorizeUseCase) {

    init {
        middlewares = listOf(PinCodeMiddleware(this))
        reducer = PinCodeReducer()
    }

}