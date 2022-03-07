package work.sample.quizapp.navigation

import android.app.Activity
import androidx.activity.ComponentActivity
import work.sample.navigation.ActionResolver
import work.sample.navigation.ResultContainer
import work.sample.navigation.params.action.ActionParams
import javax.inject.Inject

class ActionResolverImpl @Inject constructor(
    private val resultContainer: ResultContainer
) : ActionResolver {

    // list of launcher Описать конкретные случаи использования

    override fun registerResultListener(activity: ComponentActivity) {

    }

    override fun execute(activity: Activity?, data: ActionParams) {

    }


}