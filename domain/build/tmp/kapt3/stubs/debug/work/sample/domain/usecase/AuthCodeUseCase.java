package work.sample.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lwork/sample/domain/usecase/AuthCodeUseCase;", "Lwork/sample/core/UseCase;", "authRepository", "Lwork/sample/domain/repository/AuthRepository;", "(Lwork/sample/domain/repository/AuthRepository;)V", "authCheck", "Lkotlinx/coroutines/flow/Flow;", "Lwork/sample/core/DataState;", "", "phone", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
@javax.inject.Singleton()
public final class AuthCodeUseCase implements work.sample.core.UseCase {
    private final work.sample.domain.repository.AuthRepository authRepository = null;
    
    @javax.inject.Inject()
    public AuthCodeUseCase(@org.jetbrains.annotations.NotNull()
    work.sample.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object authCheck(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<java.lang.Boolean>>> continuation) {
        return null;
    }
}