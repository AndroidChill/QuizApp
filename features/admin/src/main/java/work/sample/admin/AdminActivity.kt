package work.sample.admin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import work.sample.admin.R
import work.sample.core.BaseActivity
import work.sample.navigation.Router
import javax.inject.Inject

class AdminActivity : BaseActivity() {

    @Inject
    lateinit var router: Router

    override fun initLayout() {
        setContentView(R.layout.activity_admin)

        router.bind(this)
        router.onCreate(this)
    }

    override fun onResume() {
        super.onResume()
        router.bind(this)
    }

}