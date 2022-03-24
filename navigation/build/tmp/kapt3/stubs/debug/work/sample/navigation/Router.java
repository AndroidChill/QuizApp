package work.sample.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J8\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\u0017"}, d2 = {"Lwork/sample/navigation/Router;", "", "back", "", "bind", "activity", "Landroid/app/Activity;", "getAdminIntent", "Landroid/content/Intent;", "navigate", "idContainer", "", "fragment", "Landroidx/fragment/app/Fragment;", "data", "Lwork/sample/navigation/params/screens/ScreenParams;", "sharedElements", "", "", "onCreate", "Landroidx/activity/ComponentActivity;", "sendResult", "key", "navigation_debug"})
public abstract interface Router {
    
    public abstract void onCreate(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity);
    
    public abstract void bind(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void navigate(@org.jetbrains.annotations.NotNull()
    work.sample.navigation.params.screens.ScreenParams data, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Object, java.lang.String> sharedElements);
    
    public abstract void navigate(int idContainer, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    work.sample.navigation.params.screens.ScreenParams data, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Object, java.lang.String> sharedElements);
    
    public abstract void sendResult(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object data);
    
    public abstract void back();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Intent getAdminIntent();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}