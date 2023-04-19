pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "smakatsu"
include(":shared")
include(":androidApp")
include(":androidUi")
include(":androidInit")
include(":sharedExt")
