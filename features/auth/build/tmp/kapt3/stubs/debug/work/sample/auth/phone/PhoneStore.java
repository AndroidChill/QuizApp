package work.sample.auth.phone;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lwork/sample/auth/phone/PhoneStore;", "Lwork/sample/core/mvi/Store;", "Lwork/sample/auth/phone/PhoneState;", "Lwork/sample/auth/phone/PhoneAction;", "Lwork/sample/auth/phone/PhoneNews;", "authCodeUseCase", "Lwork/sample/domain/usecase/AuthCodeUseCase;", "(Lwork/sample/domain/usecase/AuthCodeUseCase;)V", "auth_debug"})
public final class PhoneStore extends work.sample.core.mvi.Store<work.sample.auth.phone.PhoneState, work.sample.auth.phone.PhoneAction, work.sample.auth.phone.PhoneNews> {
    
    @javax.inject.Inject()
    public PhoneStore(@org.jetbrains.annotations.NotNull()
    work.sample.domain.usecase.AuthCodeUseCase authCodeUseCase) {
        super(null);
    }
}