package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.AuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthorizeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) : UseCase {

    suspend fun signIn(phone: String, name: String) =
        authRepository.signIn(phone, name)

    suspend fun signUp(phone: String, name: String, roleId: Int) =
        authRepository.signUp(phone, name, roleId)
}