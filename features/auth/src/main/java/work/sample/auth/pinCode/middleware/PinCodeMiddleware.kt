package work.sample.auth.pinCode.middleware

import work.sample.auth.pinCode.PinCodeAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store

class PinCodeMiddleware(store: Store<*, *, *>) : Middleware<PinCodeAction>(store) {

    override suspend fun effect(action: PinCodeAction): PinCodeAction? {
        TODO("Not yet implemented")
    }

}