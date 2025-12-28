package com.example.renewclient.data.network

import com.example.renewclient.domain.model.ServerSettings
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ServiceFactory @Inject constructor(
    private val baseClient: OkHttpClient,
    private val moshiConverterFactory: MoshiConverterFactory,
) {
    fun createServerApi(settings: ServerSettings): ServerApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(settings.baseUrl)
            .client(baseClient)
            .addConverterFactory(moshiConverterFactory)
            .build()

        return retrofit.create(ServerApi::class.java)
    }
}
