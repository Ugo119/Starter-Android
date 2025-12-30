plugins {
    alias(libs.plugins.starter.project.android.library)
    alias(libs.plugins.starter.project.jvm.ktor)
}

android {
    namespace = "com.ugo.auth.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}