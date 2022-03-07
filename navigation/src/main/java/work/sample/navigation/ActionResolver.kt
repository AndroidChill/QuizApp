package work.sample.navigation

import android.app.Activity
import androidx.activity.ComponentActivity
import work.sample.navigation.params.action.ActionParams

interface ActionResolver {

    fun registerResultListener(activity: ComponentActivity)

    fun execute(activity: Activity?, data: ActionParams)

}