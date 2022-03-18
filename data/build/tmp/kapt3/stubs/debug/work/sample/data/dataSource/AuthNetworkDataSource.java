package work.sample.data.dataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\t\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lwork/sample/data/dataSource/AuthNetworkDataSource;", "", "authService", "Lwork/sample/data/service/AuthService;", "(Lwork/sample/data/service/AuthService;)V", "authCheck", "Lkotlinx/coroutines/flow/Flow;", "Lwork/sample/core/DataState;", "Lwork/sample/data/models/authCheck/AuthCheckResponse;", "request", "Lwork/sample/data/models/authCheck/AuthCheckRequest;", "(Lwork/sample/data/models/authCheck/AuthCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lwork/sample/data/models/auth/signin/SignInResponse;", "Lwork/sample/data/models/auth/signin/SignInRequest;", "(Lwork/sample/data/models/auth/signin/SignInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lwork/sample/data/models/auth/signup/SignUpResponse;", "Lwork/sample/data/models/auth/signup/SignUpRequest;", "(Lwork/sample/data/models/auth/signup/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class AuthNetworkDataSource {
    private final work.sample.data.service.AuthService authService = null;
    
    @javax.inject.Inject()
    public AuthNetworkDataSource(@org.jetbrains.annotations.NotNull()
    work.sample.data.service.AuthService authService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object authCheck(@org.jetbrains.annotations.NotNull()
    work.sample.data.models.authCheck.AuthCheckRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<work.sample.data.models.authCheck.AuthCheckResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    work.sample.data.models.auth.signin.SignInRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<work.sample.data.models.auth.signin.SignInResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    work.sample.data.models.auth.signup.SignUpRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<work.sample.data.models.auth.signup.SignUpResponse>>> continuation) {
        return null;
    }
}