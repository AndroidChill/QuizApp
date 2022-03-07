package work.sample.quizapp.di.module.navigation

import dagger.MapKey
import work.sample.navigation.params.screens.ScreenParams
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ScreenKey(
    val value: KClass<out ScreenParams>
)