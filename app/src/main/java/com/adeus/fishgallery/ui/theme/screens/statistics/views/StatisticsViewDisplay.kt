package com.adeus.fishgallery.ui.theme.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.BackgroundColor
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.OnPrimaryColor
import com.adeus.fishgallery.ui.theme.components.JetRoundIcon
import com.adeus.fishgallery.ui.theme.fonts

@Composable
fun StatisticsViewDisplay() {
    val shapeCard = RoundedCornerShape(topStart = 8.dp, topEnd = 12.dp, bottomEnd = 8.dp)
    val shapeCard2 =
        RoundedCornerShape(topStart = 8.dp, topEnd = 0.dp, bottomStart = 12.dp, bottomEnd = 8.dp)
    val modSize = Modifier.fillMaxSize()
    Column(modifier = Modifier.fillMaxSize()
        .background(BackgroundColor)
        .padding(30.dp)
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column {
            Text(
                text = stringResource(R.string.header_title),
                fontSize = 20.sp,
                color = OnPrimaryColor,
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 20.dp),
            )

            Column(modifier = Modifier.padding(bottom = 30.dp)) {
                StatisticsCard(stringResource(R.string.our_catch_title), stringResource(R.string.our_catch_value), modSize, shapeCard,{})
            }
            Column(modifier = Modifier.padding(bottom = 20.dp)) {
                StatisticsCard(stringResource(R.string.our_profit_title), stringResource(R.string.our_profit_value), modSize, shapeCard2,{})
            }
            Column(modifier = Modifier.padding(bottom = 20.dp)) {
                StatisticsCard(stringResource(R.string.our_partners_title), stringResource(R.string.our_partners_value), modSize, shapeCard,{})
            }

        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(top=30.dp),
            horizontalAlignment = Alignment.End
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {

                Text(
                    text = stringResource(R.string.footer_title),
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(end = 10.dp),
                    color = OnPrimaryColor

                )
                JetRoundIcon(R.drawable.ic_launcher_foreground, Modifier.size(50.dp).clickable(onClick = {}).clip(shapeCard))
            }
        }
    }
}

@Preview
@Composable
private fun StatisticViewDisplayPreview() {
    FishGalleryTheme {
        StatisticsViewDisplay()


    }
}