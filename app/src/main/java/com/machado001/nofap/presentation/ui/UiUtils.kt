package com.machado001.nofap.presentation.ui

import android.content.Context
import android.content.Intent
import com.machado001.nofap.presentation.CountScreenUiState

fun callIntent(context: Context, state: CountScreenUiState) {
    Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, "As a gigachad, My longest streak is ${state.longestStreak}.")
        context.startActivity(Intent.createChooser(this, ""))
    }
}