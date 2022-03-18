package work.sample.auth

import work.sample.core.BaseActivity
import work.sample.navigation.Router
import javax.inject.Inject

class AuthActivity : BaseActivity() {

    @Inject
    lateinit var router: Router

    override fun initLayout() {
        setContentView(R.layout.activity_auth)

        router.bind(this)
        router.onCreate(this)
    }

    override fun onResume() {
        super.onResume()
        router.bind(this)
    }

}