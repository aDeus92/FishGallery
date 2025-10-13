package com.adeus.fishgallery.ui.theme.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.adeus.fishgallery.ui.theme.Shapes

@Composable
fun JetRoundImage(imagePath: String, modifier: Modifier) {

        AsyncImage(
            model = imagePath,
            contentDescription = "",
            modifier = modifier
                .fillMaxWidth()
                .clip(Shapes.large)
                .size(360.dp, 160.dp)

        )
    }
