package work.sample.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lwork/sample/navigation/ResultContainer;", "", "()V", "listeners", "", "", "Lwork/sample/navigation/ResultListener;", "sendResult", "", "key", "data", "setResultListener", "listener", "navigation_debug"})
@javax.inject.Singleton()
public final class ResultContainer {
    private final java.util.Map<java.lang.String, work.sample.navigation.ResultListener> listeners = null;
    
    @javax.inject.Inject()
    public ResultContainer() {
        super();
    }
    
    public final void setResultListener(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    work.sample.navigation.ResultListener listener) {
    }
    
    public final void sendResult(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
}