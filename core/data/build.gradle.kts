plugins {
    alias(libs.plugins.starter.project.android.library)
    alias(libs.plugins.starter.project.jvm.ktor)
}

android {
    namespace = "com.ugo.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}