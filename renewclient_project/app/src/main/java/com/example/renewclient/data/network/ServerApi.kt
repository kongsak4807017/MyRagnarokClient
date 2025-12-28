package com.example.renewclient.data.network

import retrofit2.http.GET

interface ServerApi {
    @GET("health")
    suspend fun healthCheck(): Unit
}
