package com.example.renewclient.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.renewclient.domain.model.ServerSettings
import com.example.renewclient.domain.usecase.ObserveServerSettingsUseCase
import com.example.renewclient.domain.usecase.RunHealthCheckUseCase
import com.example.renewclient.domain.usecase.UpdateServerSettingsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@HiltViewModel
class ServerSettingsViewModel @Inject constructor(
    observeServerSettingsUseCase: ObserveServerSettingsUseCase,
    private val updateServerSettingsUseCase: UpdateServerSettingsUseCase,
    private val runHealthCheckUseCase: RunHealthCheckUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(ServerSettingsUiState())
    val uiState: StateFlow<ServerSettingsUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            observeServerSettingsUseCase().collect { settings ->
                _uiState.update { current ->
                    current.copy(
                        protocol = settings.protocol,
                        host = settings.host,
                        port = settings.port,
                        lastMessage = ""
                    )
                }
            }
        }
    }

    fun onProtocolChange(value: String) {
        _uiState.update { it.copy(protocol = value) }
    }

    fun onHostChange(value: String) {
        _uiState.update { it.copy(host = value) }
    }

    fun onPortChange(value: String) {
        val port = value.toIntOrNull() ?: _uiState.value.port
        _uiState.update { it.copy(port = port) }
    }

    fun saveSettings() {
        val settings = ServerSettings(
            protocol = _uiState.value.protocol.trim().ifEmpty { "https" },
            host = _uiState.value.host.trim(),
            port = _uiState.value.port
        )
        _uiState.update { it.copy(isSaving = true, lastMessage = "") }
        viewModelScope.launch {
            runCatching {
                updateServerSettingsUseCase(settings)
            }.onSuccess {
                _uiState.update { it.copy(isSaving = false, lastMessage = "Saved") }
            }.onFailure { error ->
                _uiState.update { it.copy(isSaving = false, lastMessage = error.message ?: "Unknown error") }
            }
        }
    }

    fun runHealthCheck() {
        val settings = ServerSettings(
            protocol = _uiState.value.protocol,
            host = _uiState.value.host,
            port = _uiState.value.port
        )
        _uiState.update { it.copy(isChecking = true, lastMessage = "") }
        viewModelScope.launch {
            runCatching {
                runHealthCheckUseCase(settings)
            }.onSuccess {
                _uiState.update { it.copy(isChecking = false, lastMessage = "Health check passed") }
            }.onFailure { error ->
                _uiState.update { it.copy(isChecking = false, lastMessage = error.message ?: "Health check failed") }
            }
        }
    }
}

data class ServerSettingsUiState(
    val protocol: String = "https",
    val host: String = "",
    val port: Int = 443,
    val isSaving: Boolean = false,
    val isChecking: Boolean = false,
    val lastMessage: String = ""
)
