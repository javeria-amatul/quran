object Dependencies {
  const val kotlinJDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinJDKVersion}"
  const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
  const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
  const val material = "com.google.android.material:material:${Versions.materialVersion}"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
  const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
  const val navUi = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
  const val splashScreen = "androidx.core:core-splashscreen:${Versions.splashScreen}"

  //Okhttp
//  const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttpBom}"
//  const val okHttp = "com.squareup.okhttp3:okhttp"
//  const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.httpLogging}"
  //Retrofit
  const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"

  //GSON
  const val googleCodeGson = "com.google.code.gson:gson:${Versions.gsonVersion}"

  //Hilt
  const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
  const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

  const val junit = "junit:junit:${Versions.junitVersion}"
  const val junitExt = "androidx.test.ext:junit:${Versions.junitExtVersion}"
  const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
}
