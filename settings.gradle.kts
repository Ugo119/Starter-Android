pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StarterProject"

// This setting enables user to write type-safe module import
// statements in gradle like implementation(projects.auth.data)
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":auth:data")
include(":auth:domain")
include(":auth:presentation")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:presentation:designsystem")
include(":core:presentation:ui")
include(":feature_one:data")
include(":feature_one:domain")
include(":feature_one:presentation")
