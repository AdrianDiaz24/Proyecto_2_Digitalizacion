plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("org.jetbrains.dokka") version "1.9.10"
}

group = "com.proyecto.digitalizacion"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("MainKt")
}

tasks.test {
    useJUnitPlatform()
}

// Configuración de Dokka
tasks.named<org.jetbrains.dokka.gradle.DokkaTask>("dokkaHtml") {
    outputDirectory.set(buildDir.resolve("dokka/html"))
    dokkaSourceSets.configureEach {
        // Aquí puedes añadir configuración si quieres documentar solo ciertos paquetes, etc.
    }
}