package work.sample.core.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001cJ\u0019\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0018H\u0014R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lwork/sample/core/mvi/BaseViewModel;", "S", "Lwork/sample/core/mvi/State;", "A", "Lwork/sample/core/mvi/Action;", "N", "Lwork/sample/core/mvi/News;", "Landroidx/lifecycle/ViewModel;", "()V", "actionFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getActionFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "newsFlow", "getNewsFlow", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "store", "Lwork/sample/core/mvi/Store;", "getStore", "()Lwork/sample/core/mvi/Store;", "bind", "", "lifecycleCoroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "mviView", "Lwork/sample/core/mvi/MviView;", "obtainAction", "action", "(Lwork/sample/core/mvi/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtainState", "state", "(Lwork/sample/core/mvi/State;)V", "onCleared", "core_debug"})
public abstract class BaseViewModel<S extends work.sample.core.mvi.State, A extends work.sample.core.mvi.Action, N extends work.sample.core.mvi.News> extends androidx.lifecycle.ViewModel {
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableStateFlow<S> getStateFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<N> getNewsFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.MutableSharedFlow<A> getActionFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract work.sample.core.mvi.Store<S, A, N> getStore();
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object obtainAction(@org.jetbrains.annotations.NotNull()
    A action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void obtainState(@org.jetbrains.annotations.NotNull()
    S state) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleCoroutineScope lifecycleCoroutineScope, @org.jetbrains.annotations.NotNull()
    work.sample.core.mvi.MviView<S, N> mviView) {
    }
}