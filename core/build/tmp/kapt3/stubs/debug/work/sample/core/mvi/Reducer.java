package work.sample.core.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007J.\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0002\u0010\fJ-\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lwork/sample/core/mvi/Reducer;", "S", "Lwork/sample/core/mvi/State;", "A", "Lwork/sample/core/mvi/Action;", "N", "Lwork/sample/core/mvi/News;", "", "invoke", "Lkotlin/Pair;", "state", "action", "(Lwork/sample/core/mvi/State;Lwork/sample/core/mvi/Action;)Lkotlin/Pair;", "reduce", "core_debug"})
public abstract interface Reducer<S extends work.sample.core.mvi.State, A extends work.sample.core.mvi.Action, N extends work.sample.core.mvi.News> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<S, N> reduce(@org.jetbrains.annotations.NotNull()
    S state, @org.jetbrains.annotations.NotNull()
    A action);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<S, N> invoke(@org.jetbrains.annotations.NotNull()
    S state, @org.jetbrains.annotations.NotNull()
    A action);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <S extends work.sample.core.mvi.State, A extends work.sample.core.mvi.Action, N extends work.sample.core.mvi.News>kotlin.Pair<S, N> invoke(@org.jetbrains.annotations.NotNull()
        work.sample.core.mvi.Reducer<S, A, N> $this, @org.jetbrains.annotations.NotNull()
        S state, @org.jetbrains.annotations.NotNull()
        A action) {
            return null;
        }
    }
}