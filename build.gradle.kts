// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath (Plugins.androidGradlePlugin)
        classpath  (Plugins.kotlinGradlePlugin)
        classpath(Plugins.kotlinGradlePlugin)
        classpath(Plugins.hilt)
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}