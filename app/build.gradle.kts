plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.daggerHiltAndroid)
    id(Plugins.safeArgs)
}

android {
    compileSdk = Configs.compileSdkVersion

    defaultConfig {
        applicationId = Configs.applicationId
        minSdk = Configs.minSdkVersion
        targetSdk = Configs.targetSdkVersion
        versionCode = Apps.versionCode
        versionName = Apps.versionName
    }
    buildTypes {
        getByName<com.android.build.gradle.internal.dsl.BuildType>("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            setProguardFiles(
                mutableListOf(
                    getDefaultProguardFile("proguard-android.txt"),
                    "proguard-rules.pro"
                )
            )
        }
        getByName<com.android.build.gradle.internal.dsl.BuildType>("release") {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
            setProguardFiles(
                mutableListOf(
                    getDefaultProguardFile("proguard-android.txt"),
                    "proguard-rules.pro"
                )
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
        dataBinding = true
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation (Dependencies.constraintLayout)
    //hilt
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
    //Navigation component
    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)
    implementation(Dependencies.navigationDynamixFeaturesFragment)
    // For instrumentation tests
    androidTestImplementation (Dependencies.junitExt)
    androidTestImplementation (Dependencies.espressoCore)
    androidTestImplementation(Dependencies.hiltAndroidTesting)
    kaptAndroidTest(Dependencies.hiltCompiler)
    // For local unit tests
    testImplementation (Dependencies.junit)
    testImplementation(Dependencies.hiltAndroidTesting)
    kaptTest(Dependencies.hiltCompiler)

}
