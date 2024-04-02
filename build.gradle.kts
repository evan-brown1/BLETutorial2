buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${libs.versions.daggerHilt.get()}")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
//    alias(libs.plugins.daggerHiltPlugin) apply false
    id("com.google.dagger.hilt.android") version "2.50" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
