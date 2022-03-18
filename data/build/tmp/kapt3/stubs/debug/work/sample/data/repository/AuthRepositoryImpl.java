package work.sample.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ5\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lwork/sample/data/repository/AuthRepositoryImpl;", "Lwork/sample/domain/repository/AuthRepository;", "authNetworkDataSource", "Lwork/sample/data/dataSource/AuthNetworkDataSource;", "(Lwork/sample/data/dataSource/AuthNetworkDataSource;)V", "authCheck", "Lkotlinx/coroutines/flow/Flow;", "Lwork/sample/core/DataState;", "", "phone", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lwork/sample/core/DataState$Success;", "name", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "roleId", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class AuthRepositoryImpl implements work.sample.domain.repository.AuthRepository {
    private final work.sample.data.dataSource.AuthNetworkDataSource authNetworkDataSource = null;
    
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    work.sample.data.dataSource.AuthNetworkDataSource authNetworkDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object authCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<work.sample.core.DataState.Success<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int roleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<work.sample.core.DataState.Success<java.lang.Boolean>>> continuation) {
        return null;
    }
}