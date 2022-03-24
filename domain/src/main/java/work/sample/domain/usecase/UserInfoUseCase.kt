package work.sample.domain.usecase

import work.sample.core.UseCase
import work.sample.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserInfoUseCase @Inject constructor(
    private val userRepository: UserRepository
) : UseCase {

    suspend fun userInfo() =
        userRepository.userInfo()
}