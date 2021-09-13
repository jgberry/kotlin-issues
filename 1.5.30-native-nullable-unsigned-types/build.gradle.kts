plugins {
    kotlin("multiplatform") version "1.5.30"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        binaries {
            sharedLib {
                baseName = "native"
            }
        }
    }
}
