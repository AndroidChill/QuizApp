package work.sample.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lwork/sample/domain/repository/AuthRepository;", "", "authCheck", "Lkotlinx/coroutines/flow/Flow;", "Lwork/sample/core/DataState;", "", "phone", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "name", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "roleId", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int roleId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation);
}