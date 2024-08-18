package com.machado001.nofap.presentation.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
inline fun LostAlertDialog(crossinline onClose: () -> Unit) {
    AlertDialog(
        onDismissRequest = { onClose() },
        confirmButton = {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.errorContainer,
                    contentColor = MaterialTheme.colorScheme.onError
                )
            ) { Text(text = "Reset") }
        },
        dismissButton = { Button(onClick = { onClose() }) { Text(text = "Not yet!") } },
        title = { Text(text = "You really lost it?") },
        text = { Text(text = "Be honest! If u really lost it, Reset the count and be better next time.") },
    )
}