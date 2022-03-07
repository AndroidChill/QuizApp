package work.sample.auth.phone.middleware

import work.sample.auth.phone.PhoneAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.AuthCodeUseCase

class PhoneMiddleware(store: Store<*, *, *>) : Middleware<PhoneAction>(store) {

    override suspend fun effect(action: PhoneAction): PhoneAction? {
        var effect: PhoneAction? = null
        when(action) {
            is PhoneAction.AuthCheck -> {
                doRequest(
                    responseAsync = (apiUseCase as AuthCodeUseCase).authCheck(action.phone),
                    onOk = {
                        effect = PhoneAction.AuthCheckDone(it)
                    },
                    onLoading = {

                    },
                    onError = {

                    }
                )
            }
        }
        return effect
    }

}