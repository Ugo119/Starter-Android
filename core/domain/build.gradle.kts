plugins {
    alias(libs.plugins.starter.project.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.annotation.jvm)
}
