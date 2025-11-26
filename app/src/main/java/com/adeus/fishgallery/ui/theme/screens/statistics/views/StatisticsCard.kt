package com.adeus.fishgallery.ui.theme.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.OnSecondaryColor
import com.adeus.fishgallery.ui.theme.SurfaceColor
import com.adeus.fishgallery.ui.theme.utils.dashedBorder

@Composable
fun StatisticsCard(
    label: String,
    text: String,
    modifier: Modifier,
    shape: RoundedCornerShape,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .background(SurfaceColor, shape = shape)
            .dashedBorder(1.dp, Color.LightGray, shape, 4.dp, 4.dp)
            .clickable(onClick = onClick)
            .clip(shape)
            .padding(start = 10.dp, top = 10.dp, end = 20.dp, bottom = 30.dp)

        ,
        verticalArrangement = Arrangement.Bottom


    ) {
        Text(
            text = label,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = OnSecondaryColor
        )
        Row(modifier = Modifier.padding(top = 20.dp)) {
            Text(
                text = text,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = OnSecondaryColor
            )

        }
    }
}

@Preview
@Composable
private fun StatPreview() {
    FishGalleryTheme {
        val shapeCard = RoundedCornerShape(topStart = 8.dp, topEnd = 12.dp, bottomEnd = 8.dp)
        StatisticsCard(
            stringResource(R.string.our_partners_title),
            stringResource(R.string.our_partners_value),
            Modifier,
            shapeCard,
            onClick = {}
        )
    }
}