package work.sample.navigation

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import work.sample.navigation.params.screens.ScreenParams

interface Router {

    fun onCreate(activity: ComponentActivity)

    fun bind(activity: Activity)

    fun navigate(data: ScreenParams, sharedElements: Map<Any, String>? = null)

    fun navigate(idContainer: Int, fragment: Fragment, data: ScreenParams, sharedElements: Map<Any, String>? = null)

    fun sendResult(key: String, data: Any?)

    fun back()

}