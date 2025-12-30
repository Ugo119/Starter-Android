plugins {
    alias(libs.plugins.starter.project.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}
