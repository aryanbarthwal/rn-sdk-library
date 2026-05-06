rootProject.name = "rn-sdk-library"

pluginManagement {
    includeBuild("CustomReactNativeChatSdk/node_modules/@react-native/gradle-plugin")
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

// Required by the RN Gradle plugin (we intentionally skip autolinking native deps)
val autolinkFile = file("$rootDir/build/generated/autolinking/autolinking.json")
autolinkFile.parentFile.mkdirs()
autolinkFile.writeText(
    """{"packageName":"com.example.rnsdklibrary","dependencies":{}}"""
)
