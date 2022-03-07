package work.sample.navigation.bundle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H&\u00a8\u0006\u0007"}, d2 = {"Lwork/sample/navigation/bundle/BundleCreator;", "", "()V", "createBundle", "Landroid/os/Bundle;", "data", "Companion", "navigation_debug"})
public abstract class BundleCreator {
    @org.jetbrains.annotations.NotNull()
    public static final work.sample.navigation.bundle.BundleCreator.Companion Companion = null;
    
    public BundleCreator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.os.Bundle createBundle(@org.jetbrains.annotations.NotNull()
    java.lang.Object data);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lwork/sample/navigation/bundle/BundleCreator$Companion;", "", "()V", "empty", "Lwork/sample/navigation/bundle/BundleCreator;", "navigation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final work.sample.navigation.bundle.BundleCreator empty() {
            return null;
        }
    }
}