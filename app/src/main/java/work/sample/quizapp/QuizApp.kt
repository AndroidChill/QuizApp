package work.sample.quizapp

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import work.sample.quizapp.di.component.DaggerAppComponent


class QuizApp : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.factory().create(this)

}