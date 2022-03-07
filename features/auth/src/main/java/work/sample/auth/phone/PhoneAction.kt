package work.sample.auth.phone

import work.sample.core.mvi.Action

sealed class PhoneAction : Action {

    // отправляем запрос на проверку авторизации
    data class AuthCheck(val phone: String): PhoneAction()

    // после отправки номера телефона получили ошибку
    data class AuthCheckError(val error: Exception): PhoneAction()

    // получили uuid после отправки номера телефона
    data class AuthCheckDone(val isAuth: Boolean): PhoneAction()


}