buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Plugins.androidGradlePlugin)
        classpath(Plugins.kotlinGradlePlugin)
        classpath(Plugins.hiltPlugin)
        classpath(Plugins.safeArgsGradle)
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
