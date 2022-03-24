package work.sample.data.dataSource

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import work.sample.core.DataState
import work.sample.data.TokenHolder
import work.sample.data.models.group.deatils.GroupDetailsRequest
import work.sample.data.service.GroupService
import work.sample.domain.models.UserBody
import javax.inject.Inject

class GroupNetworkDataSource @Inject constructor(
    val groupService: GroupService,
    val tokenHolder: TokenHolder
) {

    suspend fun groupDetail(request: GroupDetailsRequest) : Flow<DataState<List<UserBody>>> {
        return flow<DataState<List<UserBody>>> {
            emit(DataState.Success(groupService.groupDetail(tokenHolder.get(), request)))
        }
    }

}