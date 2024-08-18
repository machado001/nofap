package com.machado001.nofap.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.machado001.nofap.presentation.components.LostAlertDialog
import com.machado001.nofap.presentation.theme.NoFapTheme
import com.machado001.nofap.presentation.ui.callIntent


@Composable
fun CountScreenRoot() {
    CountScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountScreen(state: CountScreenUiState = CountScreenUiState(0, longestStreak = 54)) {

    val context = LocalContext.current

    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        LostAlertDialog(onClose = { showDialog = false })
    }
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(PaddingValues(16.dp)),
        topBar = {
            TopAppBar(
                title = { Text("No Fap!") },
                actions = {
                    IconButton(onClick = {
                        callIntent(context, state)
                    }) {
                        Icon(Icons.Filled.Share, null)
                    }
                }
            )
        },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Box {
                Text(text = "Longest streak: ${state.longestStreak}")
            }
            Column(
                modifier = Modifier.align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "\uD83D\uDD25 Current day streak \uD83D\uDD25",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "0", fontSize = 124.sp)
                Text(
                    text = "You're just starting. Don't be a loser. Keep Strong \uD83D\uDDFF",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Current winning time: 00:00:00",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                TextButton(
                    onClick = { showDialog = true },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.onErrorContainer,
                        contentColor = MaterialTheme.colorScheme.onError
                    ),
                    contentPadding = PaddingValues(16.dp)
                ) {
                    Text(text = "I Lost! \uD83D\uDE2D", fontSize = 24.sp)
                }
            }
        }
    }
}


@Preview
@Composable
private fun CountScreenPreview() {
    NoFapTheme {
        CountScreen()
    }
}