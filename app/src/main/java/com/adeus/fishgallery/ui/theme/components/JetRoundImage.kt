package com.adeus.fishgallery.ui.theme.components


import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.Shapes

@Composable
fun JetRoundImage(imagePath: String, modifier: Modifier) {

        AsyncImage(
            model = imagePath,
            contentDescription = "",
            modifier = modifier
                .clip(Shapes.large)
                .size(360.dp, 160.dp)

        )
    }

@Preview
@Composable
private fun PRV() {
    FishGalleryTheme {

        JetRoundImage("file:///android_asset/image/fish1.jpg", Modifier)
    }
}