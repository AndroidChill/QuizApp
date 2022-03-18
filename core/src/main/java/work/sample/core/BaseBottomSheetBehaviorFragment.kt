package work.sample.core

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseBottomSheetBehaviorFragment<T: ViewBinding> : BottomSheetDialogFragment() {

    abstract val inflater: (LayoutInflater, ViewGroup?, Boolean) -> T
    protected val binding: T get() = _binding!!
    private var _binding: T? = null

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflater(inflater, container, false)

        initView()

        return binding.root
    }

    open fun initView() {}

}