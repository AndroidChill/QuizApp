package work.sample.admin.main.middlewares

import work.sample.admin.main.MainAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.UserInfoUseCase

class MainMiddleware(store: Store<*, *, *>) : Middleware<MainAction>(store) {

    override suspend fun effect(action: MainAction): MainAction? {
        var effect: MainAction? = null

        when(action) {
            is MainAction.InfoUser -> {
                doRequest(
                    responseAsync = (apiUseCase as UserInfoUseCase).userInfo(),
                    onOk = {
                        effect = MainAction.InfoUserSuccess(it)
                    },
                    onError = {},
                    onLoading = {
                        effect = MainAction.InfoUserLoading
                    }
                )
            }
        }

        return effect
    }
}