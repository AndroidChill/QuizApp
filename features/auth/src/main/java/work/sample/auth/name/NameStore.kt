package work.sample.auth.name

import work.sample.auth.name.middleware.NameMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.AuthorizeUseCase
import javax.inject.Inject

class NameStore @Inject constructor(
    authorizeUseCase: AuthorizeUseCase
) : Store<NameState, NameAction, NameNews>(authorizeUseCase) {
    init {
        middlewares = listOf(NameMiddleware(this))
        reducer = NameReducer()
    }
}