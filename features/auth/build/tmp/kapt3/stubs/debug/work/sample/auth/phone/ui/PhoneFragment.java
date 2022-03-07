package work.sample.auth.phone.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R.\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lwork/sample/auth/phone/ui/PhoneFragment;", "Lwork/sample/core/BaseFragment;", "Lwork/sample/auth/databinding/FragmentPhoneBinding;", "Lwork/sample/core/mvi/MviView;", "Lwork/sample/auth/phone/PhoneState;", "Lwork/sample/auth/phone/PhoneNews;", "()V", "inflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getInflater", "()Lkotlin/jvm/functions/Function3;", "viewModel", "Lwork/sample/auth/phone/ui/PhoneViewModel;", "getViewModel", "()Lwork/sample/auth/phone/ui/PhoneViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViewModel", "", "getCorrectPhone", "", "initListener", "initView", "renderNews", "news", "renderState", "state", "auth_debug"})
public final class PhoneFragment extends work.sample.core.BaseFragment<work.sample.auth.databinding.FragmentPhoneBinding> implements work.sample.core.mvi.MviView<work.sample.auth.phone.PhoneState, work.sample.auth.phone.PhoneNews> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, work.sample.auth.databinding.FragmentPhoneBinding> inflater = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public PhoneFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, work.sample.auth.databinding.FragmentPhoneBinding> getInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final work.sample.auth.phone.ui.PhoneViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initListener() {
    }
    
    private final java.lang.String getCorrectPhone() {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    public void renderState(@org.jetbrains.annotations.NotNull()
    work.sample.auth.phone.PhoneState state) {
    }
    
    @java.lang.Override()
    public void renderNews(@org.jetbrains.annotations.NotNull()
    work.sample.auth.phone.PhoneNews news) {
    }
}