package com.rhuertas.kmpmobilewebrequests

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class Greeting {
    private val platform = getPlatform()
    private val client = HttpClient ()


    suspend fun greet(): String {
        val response = client.get("https://ktor.io/docs")
        return response.body()
    }
}