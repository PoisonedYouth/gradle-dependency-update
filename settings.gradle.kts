rootProject.name = "gradle-dependency-update"

dependencyResolutionManagement {
    versionCatalogs {
        val ktorVersion: String by settings
        val logbackVersion: String by settings
        val kotlinVersion: String by settings

        create("libs") {
            library("ktorServerCoreJvm", "io.ktor", "ktor-server-core-jvm").version(ktorVersion)
            library("ktorServerAuthJvm", "io.ktor", "ktor-server-auth-jvm").version(ktorVersion)
            library("ktorServerContentNegotiationJvm", "io.ktor", "ktor-server-content-negotiation-jvm").version(ktorVersion)
            library("ktorServerJacksonJvm", "io.ktor", "ktor-serialization-jackson-jvm").version(ktorVersion)
            library("ktorServerNettyJvm", "io.ktor", "ktor-server-netty-jvm").version(ktorVersion)
            library("logback", "ch.qos.logback", "logback-classic").version(logbackVersion)
            library("ktorServerTestsJvm", "io.ktor", "ktor-server-tests-jvm").version(ktorVersion)
            library("kotlinTestJunit", "org.jetbrains.kotlin", "kotlin-test-junit").version(kotlinVersion)
        }
    }
}
