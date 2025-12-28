package com.example.renewclient.domain.usecase

import com.example.renewclient.domain.model.ServerSettings
import com.example.renewclient.domain.repository.ServerSettingsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ObserveServerSettingsUseCase @Inject constructor(
    private val repository: ServerSettingsRepository
) {
    operator fun invoke(): Flow<ServerSettings> = repository.settings
}
