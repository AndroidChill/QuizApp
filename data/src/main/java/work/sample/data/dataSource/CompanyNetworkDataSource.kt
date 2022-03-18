package work.sample.data.dataSource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import work.sample.core.DataState
import work.sample.data.models.companyCreate.CompanyCreateRequest
import work.sample.data.models.companyCreate.CompanyCreateResponse
import work.sample.data.service.CompanyService
import javax.inject.Inject

class CompanyNetworkDataSource @Inject constructor(
    private val companyService: CompanyService
){

    suspend fun companyCreate(request: CompanyCreateRequest) = flow<DataState<CompanyCreateResponse>> {
        emit(DataState.Success(companyService.companyCreate(request)))
    }.catch {

    }.flowOn(Dispatchers.IO)

}