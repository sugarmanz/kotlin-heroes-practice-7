import org.gradle.api.tasks.testing.logging.TestExceptionFormat

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.5.21"
    `java-library`
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter", "junit-jupiter")
}

tasks {
    named<Test>("test") {
        useJUnitPlatform()

        testLogging {
            events("passed", "skipped", "failed")
            showStackTraces = true
            exceptionFormat = TestExceptionFormat.FULL
        }
    }
}
