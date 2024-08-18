package com.machado001.nofap.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.machado001.nofap.presentation.theme.NoFapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NoFapTheme {

                Surface(
                    Modifier
                        .fillMaxSize(),
                ) {
                    CountScreenRoot()
                }
            }
        }
    }
}
