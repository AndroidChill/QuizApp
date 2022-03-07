package work.sample.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lwork/sample/navigation/ActionResolver;", "", "execute", "", "activity", "Landroid/app/Activity;", "data", "Lwork/sample/navigation/params/action/ActionParams;", "registerResultListener", "Landroidx/activity/ComponentActivity;", "navigation_debug"})
public abstract interface ActionResolver {
    
    public abstract void registerResultListener(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity);
    
    public abstract void execute(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    work.sample.navigation.params.action.ActionParams data);
}