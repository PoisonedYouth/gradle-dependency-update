plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.2.1"
}

group = "com.poisonedyouth"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.ktorServerCoreJvm)
    implementation(libs.ktorServerAuthJvm)
    implementation(libs.ktorServerContentNegotiationJvm)
    implementation(libs.ktorServerJacksonJvm)
    implementation(libs.ktorServerNettyJvm)
    implementation(libs.logback)
    testImplementation(libs.ktorServerTestsJvm)
    testImplementation(libs.kotlinTestJunit)
}
