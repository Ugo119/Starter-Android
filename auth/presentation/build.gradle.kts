plugins {
    alias(libs.plugins.starter.project.android.feature.ui)
}

android {
    namespace = "com.ugo.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}