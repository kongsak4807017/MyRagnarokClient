package com.example.renewclient.domain.model

data class ServerSettings(
    val protocol: String = "https",
    val host: String = "",
    val port: Int = 443,
) {
    val baseUrl: String
        get() = buildString {
            append(protocol)
            append("://")
            append(host)
            if (port > 0) {
                append(":")
                append(port)
            }
            append("/")
        }
}
