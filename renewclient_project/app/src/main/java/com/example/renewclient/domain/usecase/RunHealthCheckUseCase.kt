package com.example.renewclient.domain.usecase

import com.example.renewclient.data.network.ServiceFactory
import com.example.renewclient.domain.model.ServerSettings
import javax.inject.Inject

class RunHealthCheckUseCase @Inject constructor(
    private val serviceFactory: ServiceFactory
) {
    suspend operator fun invoke(settings: ServerSettings) {
        val api = serviceFactory.createServerApi(settings)
        api.healthCheck()
    }
}
