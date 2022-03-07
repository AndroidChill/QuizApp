package work.sample.core.mvi

interface MviView<S: State, N: News> {

    fun renderState(state: S)
    fun renderNews(news: N)

}