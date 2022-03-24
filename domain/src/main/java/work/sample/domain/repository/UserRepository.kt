package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState
import work.sample.domain.models.info.InfoUserBody

interface UserRepository {

    suspend fun userInfo() : Flow<DataState<InfoUserBody>>

}