package work.sample.core.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u000f\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lwork/sample/core/mvi/Store;", "S", "Lwork/sample/core/mvi/State;", "A", "Lwork/sample/core/mvi/Action;", "N", "Lwork/sample/core/mvi/News;", "", "useCase", "Lwork/sample/core/UseCase;", "(Lwork/sample/core/UseCase;)V", "middlewares", "", "Lwork/sample/core/mvi/Middleware;", "getMiddlewares", "()Ljava/util/List;", "setMiddlewares", "(Ljava/util/List;)V", "reducer", "Lwork/sample/core/mvi/Reducer;", "getReducer", "()Lwork/sample/core/mvi/Reducer;", "setReducer", "(Lwork/sample/core/mvi/Reducer;)V", "getUseCase", "()Lwork/sample/core/UseCase;", "core_debug"})
public class Store<S extends work.sample.core.mvi.State, A extends work.sample.core.mvi.Action, N extends work.sample.core.mvi.News> {
    @org.jetbrains.annotations.NotNull()
    private final work.sample.core.UseCase useCase = null;
    public java.util.List<? extends work.sample.core.mvi.Middleware<A>> middlewares;
    public work.sample.core.mvi.Reducer<S, A, N> reducer;
    
    @javax.inject.Inject()
    public Store(@org.jetbrains.annotations.NotNull()
    work.sample.core.UseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final work.sample.core.UseCase getUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<work.sample.core.mvi.Middleware<A>> getMiddlewares() {
        return null;
    }
    
    public final void setMiddlewares(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends work.sample.core.mvi.Middleware<A>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final work.sample.core.mvi.Reducer<S, A, N> getReducer() {
        return null;
    }
    
    public final void setReducer(@org.jetbrains.annotations.NotNull()
    work.sample.core.mvi.Reducer<S, A, N> p0) {
    }
}