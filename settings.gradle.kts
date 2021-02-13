rootProject.name = "dsl-builder-sample"

includeBuild("../dsl-builder") {
    dependencySubstitution {
        substitute(module("com.nicholasnassar.dslbuilder:dsl-builder-ksp:0.0.1-SNAPSHOT")).with(project(":processor"))
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

