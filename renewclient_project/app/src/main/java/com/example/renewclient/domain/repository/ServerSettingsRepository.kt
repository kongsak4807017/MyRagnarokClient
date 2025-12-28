package com.example.renewclient.domain.repository

import com.example.renewclient.domain.model.ServerSettings
import kotlinx.coroutines.flow.Flow

interface ServerSettingsRepository {
    val settings: Flow<ServerSettings>
    suspend fun update(settings: ServerSettings)
}
