import sun.jvmstat.monitor.MonitoredVmUtil.mainClass

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
}

group = "com.rhuertas.kmpmobilewebrequests"
version = "1.0.0"
application {
    mainClass = "com.rhuertas.kmpmobilewebrequests.ApplicationKt"
}

dependencies {
    api(project(":core"))
    implementation(libs.logback)
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    implementation("io.ktor:ktor-server-status-pages:${ktor}")
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
}