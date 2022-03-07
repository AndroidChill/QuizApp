package work.sample.core.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lwork/sample/core/mvi/MviView;", "S", "Lwork/sample/core/mvi/State;", "N", "Lwork/sample/core/mvi/News;", "", "renderNews", "", "news", "(Lwork/sample/core/mvi/News;)V", "renderState", "state", "(Lwork/sample/core/mvi/State;)V", "core_debug"})
public abstract interface MviView<S extends work.sample.core.mvi.State, N extends work.sample.core.mvi.News> {
    
    public abstract void renderState(@org.jetbrains.annotations.NotNull()
    S state);
    
    public abstract void renderNews(@org.jetbrains.annotations.NotNull()
    N news);
}