package com.rhuertas.kmpmobilewebrequests

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.staticResources
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    routing {
        staticResources("/","staticContent")
        get("/raul1") {
            call.respondText(sayHello("Raul"))
        }
        get("/raul2") {
            call.respondText(sayHello("Raul2"))
        }
    }
}