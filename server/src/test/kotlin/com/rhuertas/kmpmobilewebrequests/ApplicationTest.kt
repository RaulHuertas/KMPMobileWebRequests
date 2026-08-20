package com.rhuertas.kmpmobilewebrequests

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*

class ApplicationTest {

    @Test
    fun testRoot() = testApplication {
        application {
            module()
        }
        val response = client.get("/raul1")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Hello, Raul!", response.bodyAsText())

    }
    @Test
    fun testRaul2() = testApplication {
        application {
            module()
        }
        val response = client.get("/raul2")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Hello, Raul2!", response.bodyAsText())

    }
}