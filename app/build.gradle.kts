import work.sample.quizeapp.Dependencies

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "work.sample.quizapp"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    api(project(":features:auth"))
    implementation(project(":data"))

    kapt(Dependencies.Kapt.daggerCompiler)
    kapt(Dependencies.Kapt.daggerAndroidProcessor)

    implementation(Dependencies.Google.gson)
    implementation(Dependencies.SquareUp.converterGson)
    implementation(Dependencies.SquareUp.loggingInterceptor)
    implementation(Dependencies.SquareUp.retrofit)
}