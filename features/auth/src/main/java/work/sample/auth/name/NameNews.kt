package work.sample.auth.name

import work.sample.core.mvi.News

sealed class NameNews : News {
    data class ErrorMessage(
        val message: String
    ) : NameNews()
}