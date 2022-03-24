package work.sample.admin.groupDetail

import work.sample.admin.groupDetail.middleware.GroupDetailsMiddleware
import work.sample.core.mvi.Store
import work.sample.domain.usecase.GroupUseCase
import javax.inject.Inject

class GroupDetailsStore @Inject constructor(
    groupUseCase: GroupUseCase
) : Store<GroupDetailState, GroupDetailsAction, GroupDetailsNews>(groupUseCase){

    init {
        middlewares = listOf(GroupDetailsMiddleware(this))
        reducer = GroupDetailsReducer()
    }

}