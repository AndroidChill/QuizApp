package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.models.saveTest.SaveTestRequest
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

    suspend fun saveTest(request: SaveTestRequest) =
        testRepository.saveTest(request)

    suspend fun historyMy() =
        testRepository.historyMy()

    suspend fun historyAll() =
        testRepository.historyAll()
}