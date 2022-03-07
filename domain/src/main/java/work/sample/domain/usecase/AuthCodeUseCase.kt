package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.AuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) : UseCase {

    suspend fun authCheck(phone: String) =
        authRepository.authCheck(phone)

}