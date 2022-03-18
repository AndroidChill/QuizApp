package work.sample.auth.pinCode

import work.sample.core.mvi.State

sealed class PinCodeState : State {

    object Default: PinCodeState()

    object Authorize: PinCodeState()

}