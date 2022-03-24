package work.sample.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"Lwork/sample/data/RepositoryModule;", "", "()V", "provideAuthRepository", "Lwork/sample/domain/repository/AuthRepository;", "authNetworkDataSource", "Lwork/sample/data/dataSource/AuthNetworkDataSource;", "tokenHolder", "Lwork/sample/data/TokenHolder;", "provideGroupRepository", "Lwork/sample/domain/repository/GroupRepository;", "groupNetworkDataSource", "Lwork/sample/data/dataSource/GroupNetworkDataSource;", "provideTestRepository", "Lwork/sample/domain/repository/TestRepository;", "testNetworkDataSource", "Lwork/sample/data/dataSource/TestNetworkDataSource;", "provideUserRepository", "Lwork/sample/domain/repository/UserRepository;", "userNetworkDataSource", "Lwork/sample/data/dataSource/UserNetworkDataSource;", "data_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final work.sample.domain.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    work.sample.data.dataSource.AuthNetworkDataSource authNetworkDataSource, @org.jetbrains.annotations.NotNull()
    work.sample.data.TokenHolder tokenHolder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final work.sample.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    work.sample.data.dataSource.UserNetworkDataSource userNetworkDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final work.sample.domain.repository.GroupRepository provideGroupRepository(@org.jetbrains.annotations.NotNull()
    work.sample.data.dataSource.GroupNetworkDataSource groupNetworkDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final work.sample.domain.repository.TestRepository provideTestRepository(@org.jetbrains.annotations.NotNull()
    work.sample.data.dataSource.TestNetworkDataSource testNetworkDataSource) {
        return null;
    }
}