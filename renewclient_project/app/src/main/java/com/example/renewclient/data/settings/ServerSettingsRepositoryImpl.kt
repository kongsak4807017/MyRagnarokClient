package com.example.renewclient.data.settings

import com.example.renewclient.domain.model.ServerSettings
import com.example.renewclient.domain.repository.ServerSettingsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ServerSettingsRepositoryImpl @Inject constructor(
    private val dataSource: ServerPreferencesDataSource
) : ServerSettingsRepository {
    override val settings: Flow<ServerSettings> = dataSource.settings

    override suspend fun update(settings: ServerSettings) {
        dataSource.update(settings)
    }
}
