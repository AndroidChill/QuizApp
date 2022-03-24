package work.sample.admin.main

import work.sample.core.mvi.Reducer

class MainReducer : Reducer<MainState, MainAction, MainNews> {
    override fun reduce(state: MainState, action: MainAction): Pair<MainState?, MainNews?> {
        var reducedState: MainState? = null
        var reducedNews: MainNews? = null

        when (action) {
            is MainAction.InfoUserLoading -> {
                reducedState = MainState.InfoUserLoading
            }
            is MainAction.InfoUserSuccess -> {
                reducedState = MainState.InfoUserShow(action.data)
            }
        }

        return reducedState to reducedNews
    }
}