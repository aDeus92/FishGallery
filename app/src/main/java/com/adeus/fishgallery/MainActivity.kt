package com.adeus.fishgallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.screens.statistics.views.StatisticsViewDisplay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FishGalleryTheme {
                StatisticsViewDisplay()

            }
        }
    }
}

