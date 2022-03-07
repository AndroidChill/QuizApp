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
    api(project(":resources"))

    api(Dependencies.Ktx.navigationFragment)
    api(Dependencies.Ktx.navigationUi)

    api(Dependencies.Google.dagger)
    api(Dependencies.Google.daggerAndroidSupport)
    api(Dependencies.Google.daggerAndroid)
    kapt(Dependencies.Kapt.daggerCompiler)
    kapt(Dependencies.Kapt.daggerAndroidProcessor)
}