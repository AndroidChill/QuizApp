package work.sample.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import work.sample.core.DataState
import work.sample.core.toSuccess
import work.sample.data.dataSource.CompanyNetworkDataSource
import work.sample.data.models.companyCreate.CompanyCreateRequest
import work.sample.domain.repository.CompanyRepository

class CompanyRepositoryImpl(
    private val companyNetworkDataSource: CompanyNetworkDataSource
) : CompanyRepository {

    override suspend fun companyCreate(title: String, address: String) : Flow<DataState<Boolean>> =
        companyNetworkDataSource.companyCreate(CompanyCreateRequest(title, address))
            .map {
                DataState.Success(
                    it.toSuccess().id != 0
                )
            }

}