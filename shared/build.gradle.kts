import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.squareup.sqldelight")
}

kotlin {
    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    val moduleName = "shared"
    val xcf = XCFramework(moduleName)
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = moduleName
            xcf.add(this)
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":sharedExt"))
                implementation(libs.kotlinDatetime)
                implementation(libs.koinCore)
                implementation(libs.koinTest)
                implementation(libs.ktorCore)
                implementation(libs.ktorContentNegotiation)
                implementation(libs.ktorSerialization)
                implementation(libs.kotlinCoroutine)
                implementation(libs.kotlinSerialization)
                implementation(libs.sqldelightRuntime)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.sqldelightAndroid)
                implementation(libs.koinAndroid)
            }
        }
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)

            dependencies {
                implementation(libs.ktorDarwin)
                implementation(libs.sqldelightNative)
            }
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.nemo.shareddata"
    compileSdkVersion(libs.versions.androidCompileSdk.get().toInt())
    defaultConfig {
        minSdk = 26
    }
}

sqldelight {
    database("SmakatsuDB") {
        packageName = "com.nemo.shared.data.db"
        sourceFolders = listOf("sqldelight")
    }
}
