import work.sample.quizeapp.Dependencies
import work.sample.quizeapp.Base

plugins {
    id ("com.android.library")
    id ("kotlin-android")
    id ("kotlin-kapt")
}

android {
    compileSdk = Base.currentSDK

    defaultConfig {
        minSdk = Base.minSDK
        targetSdk = Base.currentSDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("boolean", "IS_USE_LOG", "false")
        }
        getByName("debug") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("boolean", "IS_USE_LOG", "true")
        }

    }
    compileOptions {
        sourceCompatibility =  JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    api(project(":navigation"))


    // ui
    api(Dependencies.Androidx.material)
    api(Dependencies.Ktx.fragment)

    // architecture
    api(Dependencies.Ktx.liveDataCore)
    api(Dependencies.Ktx.liveData)
    api(Dependencies.Ktx.viewModel)

    // DI
    api(Dependencies.javax)
    kapt(Dependencies.Kapt.daggerCompiler)
    kapt(Dependencies.Kapt.daggerAndroidProcessor)

    // kotlin
    api(Dependencies.coroutinesCore)
    api(Dependencies.coroutinesAndroid)
    api(Dependencies.kotlin)
    api(Dependencies.Ktx.core)

}