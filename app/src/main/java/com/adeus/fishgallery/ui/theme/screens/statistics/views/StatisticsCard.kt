package com.adeus.fishgallery.ui.theme.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.OnSecondaryColor
import com.adeus.fishgallery.ui.theme.TextColor
import com.adeus.fishgallery.ui.theme.utils.dashedBorder

@Composable
fun StatisticsCard(
    label: String,
    text: String,
    text2:String,
    modifier: Modifier,
    shape: RoundedCornerShape
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface, shape = shape)
            .dashedBorder(1.dp, Color.LightGray, shape, 4.dp, 4.dp)
            .padding(start = 10.dp, top = 10.dp, end = 20.dp, bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom



    ) {
        Text(
            text = label,
            fontSize = 20.sp,
            color = TextColor
        )
        Row(modifier = Modifier.padding(top = 20.dp)) {
            Text(
                text = text,
                fontSize = 25.sp,
                color = OnSecondaryColor
            )
            Text(
                modifier = modifier.padding(start = 10.dp),
                text = text2,
                fontSize = 24.sp,
                color = TextColor
            )
        }
    }
}

@Preview
@Composable
private fun StatPreview() {
    FishGalleryTheme {
        val shapeCard = RoundedCornerShape(topStart = 8.dp, topEnd = 12.dp, bottomEnd = 8.dp)
        StatisticsCard("Наш улов", "~108 000 000","тонн", Modifier, shapeCard)
    }
}