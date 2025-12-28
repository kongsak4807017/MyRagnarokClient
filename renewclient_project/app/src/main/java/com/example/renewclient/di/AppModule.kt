package com.example.renewclient.di

import android.content.Context
import com.example.renewclient.data.network.ServiceFactory
import com.example.renewclient.data.settings.ServerPreferencesDataSource
import com.example.renewclient.data.settings.ServerSettingsRepositoryImpl
import com.example.renewclient.domain.repository.ServerSettingsRepository
import com.squareup.moshi.Moshi
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindServerSettingsRepository(
        impl: ServerSettingsRepositoryImpl
    ): ServerSettingsRepository
}

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .build()

    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder().build()

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun provideServiceFactory(
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): ServiceFactory = ServiceFactory(okHttpClient, moshiConverterFactory)

    @Provides
    @Singleton
    fun provideServerPreferencesDataSource(
        @ApplicationContext context: Context
    ): ServerPreferencesDataSource = ServerPreferencesDataSource(context)
}
