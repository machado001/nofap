package com.machado001.nofap.presentation.widget

sealed interface WidgetAction {
    data object GoToAppOnClick : WidgetAction
}