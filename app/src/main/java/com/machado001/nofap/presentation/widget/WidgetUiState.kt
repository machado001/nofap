package com.machado001.nofap.presentation.widget

import kotlin.time.Duration

data class WidgetUiState(
    val currentDaysCount: Duration = Duration.ZERO,
    val motivationalPhrase: String = ""
)