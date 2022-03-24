package work.sample.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.launch
import work.sample.admin.AdminActivity
import work.sample.auth.AuthActivity
import work.sample.core.BaseActivity
import work.sample.core.DataState
import work.sample.domain.usecase.AuthCheckUseCase
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var authCheckUseCase: AuthCheckUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionRouter()
    }


    private fun actionRouter() {
        lifecycleScope.launch {
            authCheckUseCase.checkToken().collect{
                if (it is DataState.Success && it.data) {
                    startActivity(Intent(this@MainActivity, AdminActivity::class.java))
                } else {
                    startActivity(Intent(this@MainActivity, AuthActivity::class.java))
                }
                finish()
            }
        }
    }

}