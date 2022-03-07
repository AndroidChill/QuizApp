package work.sample.navigation

import work.sample.navigation.bundle.BundleCreator

data class NavigationData(
    val navId: Int,
    val bundleCreator: BundleCreator
)