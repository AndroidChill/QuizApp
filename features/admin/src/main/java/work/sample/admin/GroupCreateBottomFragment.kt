package work.sample.admin

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import work.sample.core.BaseBottomSheetBehaviorFragment
import work.sample.admin.databinding.FragmentGroupCreateBinding as Binding

class GroupCreateBottomFragment : BaseBottomSheetBehaviorFragment<Binding>(){

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    override fun initView() {

        with(binding){
            etCompanyName.addTextChangedListener {
                btnSetPhone.isEnabled = !it.isNullOrEmpty()
            }

            btnSetPhone.setOnClickListener {
                btnSetPhone.text = ""
                btnSetPhone.isEnabled = false
                pbSend.visibility = View.VISIBLE
            }
        }



    }

}