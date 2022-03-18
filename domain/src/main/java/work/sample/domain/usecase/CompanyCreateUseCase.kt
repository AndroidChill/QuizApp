package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.CompanyRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CompanyCreateUseCase @Inject constructor(
    private val companyRepository: CompanyRepository
) : UseCase {

    suspend fun companyCreate(title: String, address: String) =
        companyRepository.companyCreate(title, address)

}