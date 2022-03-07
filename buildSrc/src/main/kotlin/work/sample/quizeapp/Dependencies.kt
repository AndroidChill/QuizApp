package work.sample.quizeapp

object Dependencies {
    const val kotlin =
        "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coreKtx}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coreKtx}"
    const val javax =
        "javax.inject:javax.inject:${Versions.javax}"
    const val timber =
        "com.jakewharton.timber:timber:${Versions.timber}"

    object Androidx {
        const val appcompat =
            "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val recyclerView =
            "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val lifecycleExtensions =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}"
        const val room =
            "androidx.room:room-runtime:${Versions.room}"
        const val material =
            "com.google.android.material:material:${Versions.material}"
    }

    object Google {
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
        const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Ktx {
        const val core =
            "androidx.core:core-ktx:${Versions.coreKtx}"
        const val fragment =
            "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
        const val liveDataCore =
            "androidx.lifecycle:lifecycle-livedata-core-ktx:${Versions.liveDataCoreKtx}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataKtx}"
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModelKtx}"
        const val room =
            "androidx.room:room-ktx:${Versions.roomKtx}"
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigationKtx}"
        const val navigationUi =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigationKtx}"
    }

    object Kapt {
        const val room =
            "androidx.room:room-compiler:${Versions.room}"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    }

    object SquareUp {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging}"
    }

    object Test {
        const val junit =
            "junit:junit:${Versions.junit}"
        const val mockito =
            "org.mockito:mockito-core:${Versions.mockito}"
        const val mockitoInline =
            "org.mockito:mockito-inline:${Versions.mockito}"
    }

    object UiTest {
        const val junit =
            "androidx.test.ext:junit:${Versions.junitUi}"
        const val espresso =
            "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val espressoContrib =
            "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
        const val espressoIdling =
            "androidx.test.espresso:espresso-idling-resource:${Versions.espresso}"
        const val dagger =
            "com.google.dagger:hilt-android-testing:${Versions.dagger}"
    }
}