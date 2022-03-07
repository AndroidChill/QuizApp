package work.sample.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lwork/sample/navigation/ScreenFactory;", "", "getFragment", "Landroidx/fragment/app/Fragment;", "data", "Lwork/sample/navigation/params/screens/ScreenParams;", "navigation_debug"})
public abstract interface ScreenFactory {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.fragment.app.Fragment getFragment(@org.jetbrains.annotations.NotNull()
    work.sample.navigation.params.screens.ScreenParams data);
}