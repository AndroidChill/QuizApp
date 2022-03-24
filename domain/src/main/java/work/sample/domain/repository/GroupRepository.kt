package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.domain.models.UserBody

interface GroupRepository {

    suspend fun groupDetail(groupId: Int) : Flow<DataState<List<UserBody>>>

}