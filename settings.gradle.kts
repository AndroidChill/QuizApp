pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ( url = "https://jitpack.io" )
        maven ( url = "https://maven.google.com/" )
        maven ( url = "./localRepositories" )
    }
}
rootProject.name = "QuizApp"
include (":app")
include (":data")
include (":domain")
include (":features:auth")
include (":features:admin")
include (":core")
include (":resources")
include (":navigation")
