package work.sample.admin.groupDetail

import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.core.mvi.Reducer

class GroupDetailsReducer : Reducer<GroupDetailState, GroupDetailsAction, GroupDetailsNews>{

    override fun reduce(
        state: GroupDetailState,
        action: GroupDetailsAction
    ): Pair<GroupDetailState?, GroupDetailsNews?> {
        var reducedState: GroupDetailState? = null
        var reducedNews: GroupDetailsNews? = null

        when (action) {
            is GroupDetailsAction.GroupDetailsRequestSuccess -> {
                reducedState = GroupDetailState.GroupDetailsSuccess(action.data)
            }
        }

        return reducedState to reducedNews
    }

}