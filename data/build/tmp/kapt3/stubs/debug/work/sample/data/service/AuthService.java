package work.sample.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lwork/sample/data/service/AuthService;", "", "authCheck", "Lwork/sample/data/models/authCheck/AuthCheckResponse;", "request", "Lwork/sample/data/models/authCheck/AuthCheckRequest;", "(Lwork/sample/data/models/authCheck/AuthCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lwork/sample/data/models/signIn/SignInResponse;", "Lwork/sample/data/models/signIn/SignInRequest;", "(Lwork/sample/data/models/signIn/SignInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lwork/sample/data/models/signUp/SignUpResponse;", "Lwork/sample/data/models/signUp/SignUpRequest;", "(Lwork/sample/data/models/signUp/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface AuthService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "auth/check")
    public abstract java.lang.Object authCheck(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    work.sample.data.models.authCheck.AuthCheckRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super work.sample.data.models.authCheck.AuthCheckResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "auth/signin")
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    work.sample.data.models.signIn.SignInRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super work.sample.data.models.signIn.SignInResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "auth/signup")
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    work.sample.data.models.signUp.SignUpRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super work.sample.data.models.signUp.SignUpResponse> continuation);
}