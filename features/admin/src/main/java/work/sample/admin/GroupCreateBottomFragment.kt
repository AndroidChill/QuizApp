package work.sample.admin

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import work.sample.core.BaseBottomSheetBehaviorFragment
import work.sample.core.DataState
import work.sample.domain.usecase.GroupUseCase
import work.sample.navigation.params.screens.admin.GroupCreateCallback
import work.sample.navigation.params.screens.admin.GroupCreateScreenParams
import work.sample.navigation.params.screens.admin.GroupDetailScreenParams
import java.io.Serializable
import java.lang.Exception
import javax.inject.Inject
import work.sample.admin.databinding.FragmentGroupCreateBinding as Binding

class GroupCreateBottomFragment : BaseBottomSheetBehaviorFragment<Binding>(){

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var useCase: GroupUseCase

    override fun initView() {

        with(binding){
            etCompanyName.addTextChangedListener {
                btnAddGroup.isEnabled = !it.isNullOrEmpty()
            }

            btnAddGroup.setOnClickListener {
                btnAddGroup.text = ""
                btnAddGroup.isEnabled = false
                pbSend.visibility = View.VISIBLE

                lifecycleScope.launch {
                    useCase.groupCreate(etCompanyName.text.toString())
                        .collect { it ->
                            if (it is DataState.Success) {

                                try {
                                    val callback = arguments?.getSerializable(ARGS_CALLBACK) as GroupCreateCallback
                                    callback.onCompleted()
                                } catch (ex: Exception) {

                                }


                                if (it.data.id != 0) {
                                    this@GroupCreateBottomFragment.dismiss()
                                }
                            }
                        }
                }
            }
        }
    }

    companion object {

        private const val ARGS_CALLBACK = "args_callback"

        fun createBundleForCreateGroup(data: GroupCreateScreenParams): Bundle = Bundle().apply {
            putSerializable(ARGS_CALLBACK, data.callback as GroupCreateCallback)
        }

    }

}