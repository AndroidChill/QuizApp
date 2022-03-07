package work.sample.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&\u00a8\u0006\u000b"}, d2 = {"Lwork/sample/navigation/ScreenResolver;", "", "navigate", "", "navController", "Landroidx/navigation/NavController;", "data", "Lwork/sample/navigation/params/screens/ScreenParams;", "sharedElements", "", "", "navigation_debug"})
public abstract interface ScreenResolver {
    
    public abstract void navigate(@org.jetbrains.annotations.Nullable()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    work.sample.navigation.params.screens.ScreenParams data, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Object, java.lang.String> sharedElements);
}