package work.sample.auth.phone

import work.sample.core.mvi.State

sealed class PhoneState : State {

    object Default: PhoneState()

    object AuthorizeUser: PhoneState()

    object UnAuthorizeUser: PhoneState()

}