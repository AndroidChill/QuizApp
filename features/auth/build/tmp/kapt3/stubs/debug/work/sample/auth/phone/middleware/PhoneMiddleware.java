package work.sample.auth.phone.middleware;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lwork/sample/auth/phone/middleware/PhoneMiddleware;", "Lwork/sample/core/mvi/Middleware;", "Lwork/sample/auth/phone/PhoneAction;", "store", "Lwork/sample/core/mvi/Store;", "(Lwork/sample/core/mvi/Store;)V", "effect", "action", "(Lwork/sample/auth/phone/PhoneAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth_debug"})
public final class PhoneMiddleware extends work.sample.core.mvi.Middleware<work.sample.auth.phone.PhoneAction> {
    
    public PhoneMiddleware(@org.jetbrains.annotations.NotNull()
    work.sample.core.mvi.Store<?, ?, ?> store) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object effect(@org.jetbrains.annotations.NotNull()
    work.sample.auth.phone.PhoneAction action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super work.sample.auth.phone.PhoneAction> continuation) {
        return null;
    }
}