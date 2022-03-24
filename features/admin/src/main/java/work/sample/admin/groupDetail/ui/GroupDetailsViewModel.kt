package work.sample.admin.groupDetail.ui

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import work.sample.admin.groupDetail.GroupDetailState
import work.sample.admin.groupDetail.GroupDetailsAction
import work.sample.admin.groupDetail.GroupDetailsNews
import work.sample.admin.groupDetail.GroupDetailsStore
import work.sample.admin.main.MainAction
import work.sample.admin.main.MainNews
import work.sample.admin.main.MainState
import work.sample.admin.main.MainStore
import work.sample.core.mvi.BaseViewModel
import work.sample.navigation.Router
import javax.inject.Inject

class GroupDetailsViewModel @Inject constructor() : BaseViewModel<GroupDetailState, GroupDetailsAction, GroupDetailsNews>(){

    override val stateFlow = MutableStateFlow<GroupDetailState>(GroupDetailState.Default)
    override val actionFlow = MutableSharedFlow<GroupDetailsAction?>()
    override val newsFlow = MutableSharedFlow<GroupDetailsNews>()

    @Inject
    override lateinit var store: GroupDetailsStore

    @Inject
    lateinit var router: Router

}