package work.sample.domain.repository

import kotlinx.coroutines.flow.Flow
import work.sample.core.DataState

interface CompanyRepository {

    suspend fun companyCreate(title: String, address: String) : Flow<DataState<Boolean>>

}