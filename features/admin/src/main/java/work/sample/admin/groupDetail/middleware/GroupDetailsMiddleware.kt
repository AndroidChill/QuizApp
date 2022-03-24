package work.sample.admin.groupDetail.middleware

import work.sample.admin.groupDetail.GroupDetailsAction
import work.sample.core.mvi.Middleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.GroupUseCase

class GroupDetailsMiddleware(store: Store<*, *, *>) : Middleware<GroupDetailsAction>(store) {

    override suspend fun effect(action: GroupDetailsAction): GroupDetailsAction? {
        var effect: GroupDetailsAction? = null

        when(action) {
            is GroupDetailsAction.GroupDetailRequest -> {
                doRequest(
                    responseAsync = (apiUseCase as GroupUseCase).groupDetail(action.groupId),
                    onOk = {
                        effect = GroupDetailsAction.GroupDetailsRequestSuccess(it)
                    },
                    onError = {},
                    onLoading = {}
                )
            }
        }

        return effect
    }

}