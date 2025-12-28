package com.example.renewclient.data.settings

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.preferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.renewclient.domain.model.ServerSettings
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

private val Context.serverSettingsDataStore by preferencesDataStore(name = "server_settings")

@Singleton
class ServerPreferencesDataSource @Inject constructor(
    private val context: Context
) {

    private val protocolKey = preferencesKey<String>("protocol")
    private val hostKey = preferencesKey<String>("host")
    private val portKey = intPreferencesKey("port")

    val settings: Flow<ServerSettings> = context.serverSettingsDataStore.data
        .map { prefs: Preferences ->
            ServerSettings(
                protocol = prefs[protocolKey] ?: "https",
                host = prefs[hostKey] ?: "",
                port = prefs[portKey] ?: 443
            )
        }

    suspend fun update(settings: ServerSettings) {
        context.serverSettingsDataStore.edit { prefs ->
            prefs[protocolKey] = settings.protocol
            prefs[hostKey] = settings.host
            prefs[portKey] = settings.port
        }
    }
}
