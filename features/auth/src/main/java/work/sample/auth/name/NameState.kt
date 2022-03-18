package work.sample.auth.name

import work.sample.core.mvi.State

sealed class NameState : State{

    object Default: NameState()

    object NextScreen : NameState()
}