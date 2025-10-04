package com.adeus.fishgallery.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.FishGalleryTheme

@Composable
fun JetRoundImage(imagePath:String, modifier: Modifier)
{
    AsyncImage(
        model = imagePath,
        contentDescription = "",
        modifier = modifier
            .size(360.dp, 160.dp)
            .border(3.dp, Color.White, RoundedCornerShape(32.dp))
    )
}
@Preview
@Composable
private fun JetRoundIconPV(){
    FishGalleryTheme {
        JetRoundIcon(
            drawable = R.mipmap.ic_launcher,
            modifier = Modifier
        )
    }
}