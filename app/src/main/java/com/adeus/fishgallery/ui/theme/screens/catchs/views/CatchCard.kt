package com.adeus.fishgallery.ui.theme.screens.catchs.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.OnPrimaryColor
import com.adeus.fishgallery.ui.theme.components.JetRoundImage
import com.adeus.fishgallery.ui.theme.fonts

@Composable
fun CatchCard(
    title: String,
    value: String,
    imagePath: String,
    modifier: Modifier

) {
    Column (
        modifier=modifier.padding(start = 10.dp, top = 40.dp, end = 10.dp),
        verticalArrangement = Arrangement.Center
    ){
        JetRoundImage(imagePath,modifier)
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

        ){
            Text(text = title,
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                color = OnPrimaryColor            )
            Text(text = value,
                fontFamily = fonts,
                color = OnPrimaryColor)
        }
    }
}

@Preview
@Composable
private fun CatchCardPreview(){
    FishGalleryTheme {
        CatchCard("Призрачный дельфин","50 000 000 тонн", "file:///android_asset/image/fish1.jpg", Modifier)
    }
}