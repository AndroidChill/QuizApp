package work.sample.auth.phone;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lwork/sample/auth/phone/PhoneState;", "Lwork/sample/core/mvi/State;", "()V", "AuthorizeUser", "Default", "UnAuthorizeUser", "Lwork/sample/auth/phone/PhoneState$Default;", "Lwork/sample/auth/phone/PhoneState$AuthorizeUser;", "Lwork/sample/auth/phone/PhoneState$UnAuthorizeUser;", "auth_debug"})
public abstract class PhoneState implements work.sample.core.mvi.State {
    
    private PhoneState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lwork/sample/auth/phone/PhoneState$Default;", "Lwork/sample/auth/phone/PhoneState;", "()V", "auth_debug"})
    public static final class Default extends work.sample.auth.phone.PhoneState {
        @org.jetbrains.annotations.NotNull()
        public static final work.sample.auth.phone.PhoneState.Default INSTANCE = null;
        
        private Default() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lwork/sample/auth/phone/PhoneState$AuthorizeUser;", "Lwork/sample/auth/phone/PhoneState;", "()V", "auth_debug"})
    public static final class AuthorizeUser extends work.sample.auth.phone.PhoneState {
        @org.jetbrains.annotations.NotNull()
        public static final work.sample.auth.phone.PhoneState.AuthorizeUser INSTANCE = null;
        
        private AuthorizeUser() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lwork/sample/auth/phone/PhoneState$UnAuthorizeUser;", "Lwork/sample/auth/phone/PhoneState;", "()V", "auth_debug"})
    public static final class UnAuthorizeUser extends work.sample.auth.phone.PhoneState {
        @org.jetbrains.annotations.NotNull()
        public static final work.sample.auth.phone.PhoneState.UnAuthorizeUser INSTANCE = null;
        
        private UnAuthorizeUser() {
            super();
        }
    }
}