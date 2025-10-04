package com.adeus.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.FishGalleryTheme


@Composable
fun JetRoundIcon(drawable:Int,modifier: Modifier){
    Box(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.background)
            .border(2.dp, MaterialTheme.colorScheme.onPrimary, shape = CircleShape)
            .padding(2.dp),
        contentAlignment = Alignment.Center
    ){
        Icon(
            imageVector = ImageVector.vectorResource(id = drawable),
            contentDescription = "App Icon",
        )
    }
}

