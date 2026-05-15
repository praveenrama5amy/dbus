plugins {
    java
    kotlin("jvm") version "2.3.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

val dbusVersion             = "5.1.0"

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.hypfvieh:dbus-java-core:${dbusVersion}")
    implementation("com.github.hypfvieh:dbus-java-transport-jnr-unixsocket:${dbusVersion}")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "org.example.MainKt"
}

tasks.test {
    useJUnitPlatform()
}