package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.AuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthCheckUseCase @Inject constructor(
    private val authRepository: AuthRepository
) : UseCase {

    suspend fun checkToken() =
        authRepository.checkToken()

}