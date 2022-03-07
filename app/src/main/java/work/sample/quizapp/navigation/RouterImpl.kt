package work.sample.quizapp.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import work.sample.navigation.ActionResolver
import work.sample.navigation.ResultContainer
import work.sample.navigation.Router
import work.sample.navigation.ScreenResolver
import work.sample.navigation.params.screens.ScreenParams
import work.sample.quizapp.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RouterImpl @Inject constructor(
    private val screenResolver: ScreenResolver,
    private val actionResolver: ActionResolver,
    private val resultContainer: ResultContainer,
    private val context: Context
) : Router {

    private var navController: NavController? = null
    private var activity: Activity? = null

    override fun onCreate(activity: ComponentActivity) {
        actionResolver.registerResultListener(activity)
    }

    override fun bind(activity: Activity) {
        this.navController = activity.findNavController(R.id.container)
        this.activity = activity
    }

    override fun navigate(data: ScreenParams, sharedElements: Map<Any, String>?) {
        screenResolver.navigate(this.navController, data, sharedElements)
    }

    override fun navigate(
        idContainer: Int,
        fragment: Fragment,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    ) {

    }

    override fun sendResult(key: String, data: Any?) {
        resultContainer.sendResult(key, data)
    }

    override fun back() {
        navController?.navigateUp()
    }
}