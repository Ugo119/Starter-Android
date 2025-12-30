plugins {
    alias(libs.plugins.starter.project.android.library)
    alias(libs.plugins.starter.project.android.room)
}

android {
    namespace = "com.ugo.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}