package work.sample.data

import dagger.Module
import dagger.Provides
import work.sample.data.dataSource.AuthNetworkDataSource
import work.sample.data.dataSource.GroupNetworkDataSource
import work.sample.data.dataSource.TestNetworkDataSource
import work.sample.data.dataSource.UserNetworkDataSource
import work.sample.data.repository.AuthRepositoryImpl
import work.sample.data.repository.GroupRepositoryImpl
import work.sample.data.repository.TestRepositoryImpl
import work.sample.data.repository.UserRepositoryImpl
import work.sample.domain.repository.AuthRepository
import work.sample.domain.repository.GroupRepository
import work.sample.domain.repository.TestRepository
import work.sample.domain.repository.UserRepository
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(
        authNetworkDataSource: AuthNetworkDataSource,
        tokenHolder: TokenHolder
    ) : AuthRepository = AuthRepositoryImpl(authNetworkDataSource, tokenHolder)

    @Provides
    @Singleton
    fun provideUserRepository(
        userNetworkDataSource: UserNetworkDataSource
    ) : UserRepository = UserRepositoryImpl(userNetworkDataSource)

    @Singleton
    @Provides
    fun provideGroupRepository(
        groupNetworkDataSource: GroupNetworkDataSource
    ) : GroupRepository = GroupRepositoryImpl(groupNetworkDataSource)

    @Singleton
    @Provides
    fun provideTestRepository(
        testNetworkDataSource: TestNetworkDataSource
    ) : TestRepository = TestRepositoryImpl(testNetworkDataSource)
}