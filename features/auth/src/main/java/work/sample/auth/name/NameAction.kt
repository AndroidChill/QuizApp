package work.sample.auth.name

import work.sample.core.mvi.Action

sealed class NameAction : Action {

    data class SignIn(
        val phone: String,
        val name: String
    ) : NameAction()

    data class SignInError(
        val error: Exception
    ) : NameAction()

    object SignInSuccess : NameAction()

    data class SignUp(
        val phone: String,
        val name: String,
        val roleId: Int
    ) : NameAction()


    data class SignUpError(
        val error: Exception
    ) : NameAction()

    object SignUpSuccess : NameAction()


}