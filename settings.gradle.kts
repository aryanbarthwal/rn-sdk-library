rootProject.name = "rn-sdk-library"

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.multiplatform") version "2.1.10"
        id("com.android.library") version "8.13.0"
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}
