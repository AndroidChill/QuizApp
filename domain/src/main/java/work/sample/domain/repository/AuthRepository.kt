package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState

interface AuthRepository {

    suspend fun authCheck(phone: String): Flow<DataState<Boolean>>

    suspend fun signIn(phone: String, name: String) : Flow<DataState<Boolean>>

    suspend fun signUp(phone: String, name: String, roleId: Int) : Flow<DataState<Boolean>>
}