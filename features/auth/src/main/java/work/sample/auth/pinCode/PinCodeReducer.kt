package work.sample.auth.pinCode

import work.sample.core.mvi.Reducer

class PinCodeReducer: Reducer<PinCodeState, PinCodeAction, PinCodeNews> {

    override fun reduce(
        state: PinCodeState,
        action: PinCodeAction
    ): Pair<PinCodeState?, PinCodeNews?> {
        TODO("Not yet implemented")
    }

}