package work.sample.data

import dagger.Module
import dagger.Provides
import work.sample.data.dataSource.AuthNetworkDataSource
import work.sample.data.repository.AuthRepositoryImpl
import work.sample.domain.repository.AuthRepository
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(
        authNetworkDataSource: AuthNetworkDataSource,
        tokenHolder: TokenHolder
    ) : AuthRepository = AuthRepositoryImpl(authNetworkDataSource, tokenHolder)

}