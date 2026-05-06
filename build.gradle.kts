import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
    id("com.facebook.react")
    id("maven-publish")
}

group = "com.github.aryanbarthwal"
version = "0.1.0"

kotlin {
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
        }
        androidMain.dependencies {
            implementation("com.facebook.react:react-android")
            implementation("com.facebook.react:hermes-android")
        }
        iosMain.dependencies {
        }
    }
}

react {
    root = file("CustomReactNativeChatSdk")
    reactNativeDir = file("CustomReactNativeChatSdk/node_modules/react-native")
    codegenDir = file("CustomReactNativeChatSdk/node_modules/@react-native/codegen")
    cliFile = file("CustomReactNativeChatSdk/node_modules/.bin/react-native")
    entryFile = file("CustomReactNativeChatSdk/index.js")
    bundleAssetName = "index.android.bundle"
    debuggableVariants = emptyList()
    // autolinkLibrariesWithApp() intentionally omitted
}

android {
    namespace = "com.example.rnsdklibrary"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
    }

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
