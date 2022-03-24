package work.sample.admin.main

import work.sample.admin.main.middlewares.MainMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.UserInfoUseCase
import javax.inject.Inject

class MainStore @Inject constructor(
    userInfoUseCase: UserInfoUseCase
) : Store<MainState, MainAction, MainNews>(userInfoUseCase) {

    init {
        middlewares = listOf(MainMiddleware(this))
        reducer = MainReducer()
    }

}