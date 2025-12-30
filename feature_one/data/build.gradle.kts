plugins {
    alias(libs.plugins.starter.project.android.library)
}

android {
    namespace = "com.ugo.feature_one.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
    implementation(libs.androidx.work)
    implementation(libs.koin.android.workmanager)
    implementation(libs.kotlinx.serialization.json)

    implementation(projects.core.database)
    implementation(projects.core.domain)
    implementation(projects.featureOne.domain)
}