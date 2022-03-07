package work.sample.core.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0002\u0010\u0005Ja\u0010\f\u001a\u00020\r\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J]\u0010\u0019\u001a\u00020\r\"\u0004\b\u0001\u0010\u000e2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00100\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00028\u0000H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lwork/sample/core/mvi/Middleware;", "A", "", "store", "Lwork/sample/core/mvi/Store;", "(Lwork/sample/core/mvi/Store;)V", "apiUseCase", "Lwork/sample/core/UseCase;", "getApiUseCase", "()Lwork/sample/core/UseCase;", "setApiUseCase", "(Lwork/sample/core/UseCase;)V", "doRequest", "", "T", "responseAsync", "Lkotlinx/coroutines/flow/Flow;", "Lwork/sample/core/DataState;", "onOk", "Lkotlin/Function1;", "onLoading", "Lkotlin/Function0;", "onError", "Ljava/lang/Exception;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRequestCompletable", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "effect", "action", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "core_debug"})
public abstract class Middleware<A extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private work.sample.core.UseCase apiUseCase;
    
    public Middleware(@org.jetbrains.annotations.NotNull()
    work.sample.core.mvi.Store<?, ?, ?> store) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final work.sample.core.UseCase getApiUseCase() {
        return null;
    }
    
    public final void setApiUseCase(@org.jetbrains.annotations.NotNull()
    work.sample.core.UseCase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object effect(A action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super A> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(A action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super A> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object doRequest(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends work.sample.core.DataState<? extends T>> responseAsync, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onOk, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object doRequestCompletable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends T>>, ? extends java.lang.Object> responseAsync, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOk, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}