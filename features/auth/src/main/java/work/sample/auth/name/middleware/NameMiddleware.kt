package work.sample.auth.name.middleware

import work.sample.auth.name.NameAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.AuthorizeUseCase

class NameMiddleware(store: Store<*, *, *>) : Middleware<NameAction>(store) {

    override suspend fun effect(action: NameAction): NameAction? {
        var effect: NameAction? = null
        when(action) {
            is NameAction.SignIn -> {
                doRequest(
                    responseAsync = (apiUseCase as AuthorizeUseCase).signIn(action.phone, action.name),
                    onOk = {
                        effect = NameAction.SignInSuccess
                    },
                    onError = {
                        effect = NameAction.SignInError(it)
                    },
                    onLoading = {}
                )
            }
            is NameAction.SignUp -> {
                doRequest(
                    responseAsync = (apiUseCase as AuthorizeUseCase).signUp(action.phone, action.name, action.roleId),
                    onOk = {
                        effect = NameAction.SignUpSuccess
                    },
                    onError = {
                        effect = NameAction.SignUpError(it)
                    },
                    onLoading = {}
                )
            }
        }

        return effect
    }

}