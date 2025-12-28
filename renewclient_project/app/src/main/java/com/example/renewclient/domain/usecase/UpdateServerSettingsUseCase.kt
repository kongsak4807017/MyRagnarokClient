package com.example.renewclient.domain.usecase

import com.example.renewclient.domain.model.ServerSettings
import com.example.renewclient.domain.repository.ServerSettingsRepository
import javax.inject.Inject

class UpdateServerSettingsUseCase @Inject constructor(
    private val repository: ServerSettingsRepository
) {
    suspend operator fun invoke(settings: ServerSettings) {
        repository.update(settings)
    }
}
