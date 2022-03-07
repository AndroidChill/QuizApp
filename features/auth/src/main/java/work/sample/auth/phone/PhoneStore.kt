package work.sample.auth.phone

import work.sample.auth.phone.middleware.PhoneMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.AuthCodeUseCase
import javax.inject.Inject

class PhoneStore @Inject constructor(
    authCodeUseCase: AuthCodeUseCase
) : Store<PhoneState, PhoneAction, PhoneNews> (authCodeUseCase) {

    init {
        middlewares = listOf(PhoneMiddleware(store = this))
        reducer = PhoneReducer()
    }

}