package work.sample.core.mvi

import work.sample.core.UseCase
import javax.inject.Inject

open class Store<S: State, A: Action, N: News> @Inject constructor(
    val useCase: UseCase
){
    lateinit var middlewares: List<Middleware<A>>
    lateinit var reducer: Reducer<S, A, N>
}