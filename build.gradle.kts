buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id("com.squareup.sqldelight") version libs.versions.sqldelight.get() apply false
    kotlin("android").version("1.8.20").apply(false)
    kotlin("multiplatform").version("1.8.20").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
