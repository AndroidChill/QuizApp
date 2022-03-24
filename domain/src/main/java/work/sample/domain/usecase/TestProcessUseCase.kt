package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.models.test.TestDetailRequest
import work.sample.domain.repository.TestRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TestProcessUseCase @Inject constructor(
    private val testRepository: TestRepository
) : UseCase {

    suspend fun testDetail(request: TestDetailRequest) =
        testRepository.testDetail(request)

}