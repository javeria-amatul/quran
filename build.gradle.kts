buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Plugins.androidGradlePlugin)
        classpath(Plugins.kotlinGradlePlugin)
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
