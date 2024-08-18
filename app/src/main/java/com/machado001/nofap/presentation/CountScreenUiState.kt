package com.machado001.nofap.presentation

import kotlin.time.Duration

data class CountScreenUiState(
    val currentStreak: Int = 0,
    val longestStreak: Int = 0,
    val currentTime: Duration = Duration.ZERO,
)