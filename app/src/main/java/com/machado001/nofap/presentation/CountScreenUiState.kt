package com.machado001.nofap.presentation

data class CountScreenUiState(
    val currentStreak: Int = 0,
    val longestStreak: Int = 0,
    val currentTime: Long = 0,
)