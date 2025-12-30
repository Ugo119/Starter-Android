plugins {
    alias(libs.plugins.starter.project.android.feature.ui)
}

android {
    namespace = "com.ugo.feature_one.presentation"
}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.featureOne.domain)
    implementation(projects.core.domain)
}