package work.sample.navigation.bundle

import android.os.Bundle
import work.sample.navigation.params.screens.ScreenParams

inline fun <T : ScreenParams> bundleCreateDelegate(
    crossinline bundleCreator: ((T) -> Bundle),
) = object : BundleCreator() {

    @Suppress("UNCHECKED_CAST")
    override fun createBundle(data: Any): Bundle {
        return bundleCreator(data as T)
    }

}