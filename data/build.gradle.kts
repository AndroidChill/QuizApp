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
    implementation(project(":domain"))

    kapt(Dependencies.Kapt.daggerCompiler)
    annotationProcessor(Dependencies.Kapt.daggerAndroidProcessor)

    implementation(Dependencies.Google.gson)
    implementation(Dependencies.SquareUp.converterGson)
    implementation(Dependencies.SquareUp.loggingInterceptor)
    implementation(Dependencies.SquareUp.retrofit)
}