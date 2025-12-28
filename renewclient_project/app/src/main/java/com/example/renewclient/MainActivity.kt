package com.example.renewclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardOptions
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.KeyboardType
import com.example.renewclient.presentation.ServerSettingsUiState
import com.example.renewclient.presentation.ServerSettingsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: ServerSettingsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val uiState by viewModel.uiState.collectAsState()
                    ServerSettingsScreen(
                        state = uiState,
                        onProtocolChange = viewModel::onProtocolChange,
                        onHostChange = viewModel::onHostChange,
                        onPortChange = viewModel::onPortChange,
                        onSave = viewModel::saveSettings,
                        onHealthCheck = viewModel::runHealthCheck
                    )
                }
            }
        }
    }
}

@Composable
fun ServerSettingsScreen(
    state: ServerSettingsUiState,
    onProtocolChange: (String) -> Unit,
    onHostChange: (String) -> Unit,
    onPortChange: (String) -> Unit,
    onSave: () -> Unit,
    onHealthCheck: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Server settings", style = MaterialTheme.typography.titleLarge)
        OutlinedTextField(
            value = state.protocol,
            onValueChange = onProtocolChange,
            label = { Text(text = "Protocol") }
        )
        OutlinedTextField(
            value = state.host,
            onValueChange = onHostChange,
            label = { Text(text = "Host") }
        )
        OutlinedTextField(
            value = state.port.toString(),
            onValueChange = onPortChange,
            label = { Text(text = "Port") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick = onSave, enabled = !state.isSaving) {
            Text(text = if (state.isSaving) "Saving..." else "Save")
        }
        Button(onClick = onHealthCheck, enabled = !state.isChecking) {
            Text(text = if (state.isChecking) "Checking..." else "Health check")
        }
        Spacer(modifier = Modifier.height(8.dp))
        if (state.lastMessage.isNotEmpty()) {
            Text(text = state.lastMessage)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ServerSettingsScreenPreview() {
    MaterialTheme {
        ServerSettingsScreen(
            state = ServerSettingsUiState(host = "example.com"),
            onProtocolChange = {},
            onHostChange = {},
            onPortChange = {},
            onSave = {},
            onHealthCheck = {}
        )
    }
}
