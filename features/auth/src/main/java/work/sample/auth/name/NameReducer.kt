package work.sample.auth.name

import work.sample.core.mvi.Reducer

class NameReducer : Reducer<NameState, NameAction, NameNews> {

    override fun reduce(state: NameState, action: NameAction): Pair<NameState?, NameNews?> {
        var reducedState: NameState? = null
        var reducedNews: NameNews? = null

        when(action) {

            is NameAction.SignInError -> {
                reducedNews = NameNews.ErrorMessage(action.error.message!!)
            }

            is NameAction.SignInSuccess, NameAction.SignUpSuccess -> {
                reducedState = NameState.NextScreen
            }

            is NameAction.SignUpError -> {
                reducedNews = NameNews.ErrorMessage(action.error.message!!)
            }

            is NameAction.SignUpSuccess -> {
                reducedState = NameState.NextScreen
            }

        }
        return reducedState to reducedNews
    }

}