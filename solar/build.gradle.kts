import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.vanniktech.mavenPublish)
}

group = "dev.chiksmedina.solar"
version = "2.0.0"

kotlin {
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)
                implementation(libs.compose.ui)
            }
        }
    }

}

android {
    namespace = "com.chiksmedina.solar"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "solar", version.toString())

    pom {
        name = "Solar Icon Set"
        description = "Solar is a library that provides icon pack for Android development"
        inceptionYear = "2023"
        url = "https://github.com/CMFerrer/SolarIconSetAndroid"
        licenses {
            license {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "repo"
            }
        }
        developers {
            developer {
                id = "chiksmedina"
                name = "Chiks Medina"
                email = "hola@chiksmedina.dev"
                url = "https://github.com/CMFerrer"
            }
        }
        scm {
            url = "https://github.com/CMFerrer/SolarIconSetAndroid"
            connection = "scm:git:git://github.com/CMFerrer/SolarIconSetAndroid.git"
            developerConnection = "scm:git:ssh://git@github.com/CMFerrer/SolarIconSetAndroid.git"
        }
    }
}