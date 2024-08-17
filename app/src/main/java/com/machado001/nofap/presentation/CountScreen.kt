package com.machado001.nofap.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.machado001.nofap.presentation.theme.NoFapTheme


@Composable
fun CountScreenRoot() {


    CountScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountScreen(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Keep Strong.") })
        }
    ) {

    }
//    Column(
//        modifier = modifier.fillMaxSize(),
//    ) {
//        Text(text = "Current streak:")
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(text = "0")
//        Text(text = "You is just starting.")
//    }
}

@Preview
@Composable
private fun CountScreenPreview() {
    NoFapTheme {
        CountScreen()
    }
}