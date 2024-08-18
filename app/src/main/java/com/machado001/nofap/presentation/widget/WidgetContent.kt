package com.machado001.nofap.presentation.widget

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.background
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.preview.ExperimentalGlancePreviewApi
import androidx.glance.preview.Preview
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import com.machado001.nofap.presentation.MainActivity
import kotlin.time.Duration.Companion.days


@Composable
fun WidgetContentRoot(action: WidgetAction) {


    when (action) {
        WidgetAction.GoToAppOnClick -> actionStartActivity<MainActivity>()
    }
    WidgetContent(
        action = action, state = WidgetUiState(
            currentDaysCount = 128.days,
            motivationalPhrase = "You can."
        )
    )
}

@Composable
fun WidgetContent(
    action: WidgetAction = WidgetAction.GoToAppOnClick,
    state: WidgetUiState = WidgetUiState()
) {
    Box(
        modifier = GlanceModifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {

        Column(
            modifier = GlanceModifier,
        ) {
            Spacer(modifier = GlanceModifier.padding(vertical = 8.dp))
            Text(text = state.motivationalPhrase)
            Spacer(modifier = GlanceModifier.padding(vertical = 8.dp))
            Row {
                Text(
                    text = state.currentDaysCount.inWholeDays.toString(),
                    style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Bold)
                )
                Text(text = "Days")
            }
        }
    }
}