rootProject.name = "dsl-builder-sample"

includeBuild("../dsl-builder") {
    dependencySubstitution {
        substitute(module("com.nicholasnassar.dslbuilder:dsl-builder-api:0.0.1-SNAPSHOT")).using(project(":api"))
        substitute(module("com.nicholasnassar.dslbuilder:dsl-builder-ksp:0.0.1-SNAPSHOT")).using(project(":processor"))
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

