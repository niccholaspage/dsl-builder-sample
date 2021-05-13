plugins {
    id("com.google.devtools.ksp") version "1.5.0-1.0.0-alpha10"
    kotlin("jvm") version "1.5.0"
    idea
}

version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

sourceSets {
    main {
        java {
            srcDir("build/generated/ksp/main/kotlin")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.nicholasnassar.dslbuilder:dsl-builder-api:0.0.1-SNAPSHOT")
    ksp("com.nicholasnassar.dslbuilder:dsl-builder-ksp:0.0.1-SNAPSHOT")
}

ksp {
    arg("context_class", "com.example.Context")
    arg("dynamic_value_class", "com.example.DynamicValue")
    arg("static_dynamic_value_class", "com.example.StaticDynamicValue")
    arg("computed_dynamic_value_class", "com.example.ComputedDynamicValue")
    arg("rolling_dynamic_value_class", "com.example.RollingDynamicValue")
    arg("dsl_marker_annotation_class", "com.example.MyMarker")
}
