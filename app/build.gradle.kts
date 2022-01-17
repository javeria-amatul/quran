plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
}

android {
    compileSdkVersion(Configs.compileSdkVersion)
    buildToolsVersion(Configs.buildToolsVersion)

    defaultConfig {
        applicationId = Configs.applicationId
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(Dependencies.kotlinJDK)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.navFragment)
    implementation(Dependencies.navUi)
    implementation(Dependencies.splashScreen)


    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.junitExt)
    androidTestImplementation(Dependencies.espressoCore)
}