package work.sample.auth.phone.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\""}, d2 = {"Lwork/sample/auth/phone/ui/PhoneViewModel;", "Lwork/sample/core/mvi/BaseViewModel;", "Lwork/sample/auth/phone/PhoneState;", "Lwork/sample/auth/phone/PhoneAction;", "Lwork/sample/auth/phone/PhoneNews;", "()V", "actionFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getActionFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "newsFlow", "getNewsFlow", "router", "Lwork/sample/navigation/Router;", "getRouter", "()Lwork/sample/navigation/Router;", "setRouter", "(Lwork/sample/navigation/Router;)V", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "store", "Lwork/sample/auth/phone/PhoneStore;", "getStore", "()Lwork/sample/auth/phone/PhoneStore;", "setStore", "(Lwork/sample/auth/phone/PhoneStore;)V", "back", "", "navigateChooseRole", "phone", "", "navigatePinCode", "auth_debug"})
public final class PhoneViewModel extends work.sample.core.mvi.BaseViewModel<work.sample.auth.phone.PhoneState, work.sample.auth.phone.PhoneAction, work.sample.auth.phone.PhoneNews> {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<work.sample.auth.phone.PhoneState> stateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<work.sample.auth.phone.PhoneAction> actionFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<work.sample.auth.phone.PhoneNews> newsFlow = null;
    @javax.inject.Inject()
    public work.sample.auth.phone.PhoneStore store;
    @javax.inject.Inject()
    public work.sample.navigation.Router router;
    
    @javax.inject.Inject()
    public PhoneViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableStateFlow<work.sample.auth.phone.PhoneState> getStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableSharedFlow<work.sample.auth.phone.PhoneAction> getActionFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.MutableSharedFlow<work.sample.auth.phone.PhoneNews> getNewsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public work.sample.auth.phone.PhoneStore getStore() {
        return null;
    }
    
    public void setStore(@org.jetbrains.annotations.NotNull()
    work.sample.auth.phone.PhoneStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final work.sample.navigation.Router getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    work.sample.navigation.Router p0) {
    }
    
    public final void navigateChooseRole() {
    }
    
    public final void navigatePinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    public final void navigateChooseRole(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    public final void back() {
    }
}