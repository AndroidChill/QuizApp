package work.sample.auth.phone

import work.sample.core.mvi.Reducer

class PhoneReducer : Reducer<PhoneState, PhoneAction, PhoneNews> {

    override fun reduce(state: PhoneState, action: PhoneAction): Pair<PhoneState?, PhoneNews?> {
        var reducedState: PhoneState? = null
        var reducedNews: PhoneNews? = null

        when(action) {
            is PhoneAction.AuthCheckDone -> {
                if (action.isAuth) {
                    reducedState = PhoneState.AuthorizeUser
                } else {
                    reducedState = PhoneState.UnAuthorizeUser
                }
            }
        }

        return reducedState to reducedNews
    }

}