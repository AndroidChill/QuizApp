package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState

interface AuthRepository {

    suspend fun authCheck(phone: String): Flow<DataState<Boolean>>

}