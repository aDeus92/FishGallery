package com.adeus.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.BackgroundColor
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.OnPrimaryColor
import com.adeus.fishgallery.ui.theme.Shapes


@Composable
fun JetRoundIcon(drawable:Int,modifier: Modifier){
    Box(
        modifier = modifier
            .clip(Shapes.large)
            .background(BackgroundColor)
            .border(2.dp, OnPrimaryColor, shape = CircleShape)
            .padding(2.dp),
        contentAlignment = Alignment.Center
    ){
        Icon(
            imageVector = ImageVector.vectorResource(id = drawable),
            contentDescription = "App Icon",
            tint = Color.White
        )
    }
}

@Preview
@Composable
private fun JetRoundIconPreview(){
    FishGalleryTheme {
        JetRoundIcon(R.drawable.ic_launcher_foreground,Modifier)
    }
}

