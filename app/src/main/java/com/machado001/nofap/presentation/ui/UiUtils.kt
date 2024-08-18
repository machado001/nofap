package com.machado001.nofap.presentation.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import com.machado001.nofap.presentation.CountScreenUiState
import kotlin.time.Duration

fun callIntent(context: Context, state: CountScreenUiState) = Intent(Intent.ACTION_SEND).apply {
    type = "text/plain"
    putExtra(Intent.EXTRA_TEXT, "As a gigachad, My longest streak is ${state.longestStreak}.")
    context.startActivity(Intent.createChooser(this, ""))
}



@SuppressLint("DefaultLocale")
fun Duration.formatted(): String {
    val totalSeconds = inWholeSeconds
    val hours = String.format("%02d", totalSeconds / (60 * 60))
    val minutes = String.format("%02d", (totalSeconds % 3600) / 60)
    val seconds = String.format("%02d", (totalSeconds % 60))

    return "$hours:$minutes:$seconds"
}