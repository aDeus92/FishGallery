package com.adeus.fishgallery.ui.theme.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.PrimaryColor
import com.adeus.fishgallery.ui.theme.components.JetRoundIcon

@Composable
fun StatisticsViewDisplay() {
    val shapeCard = RoundedCornerShape(topStart = 8.dp, topEnd = 12.dp, bottomEnd = 8.dp)
    val shapeCard2 =
        RoundedCornerShape(topStart = 8.dp, topEnd = 0.dp, bottomStart = 12.dp, bottomEnd = 8.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())

    ) {
        Text(text = stringResource(R.string.header_title))

        Column(modifier = Modifier.padding(bottom = 30.dp)) {
            StatisticsCard("Наш улов", "~108 000 000", "тонн", Modifier, shapeCard)
        }
        Column(modifier = Modifier.padding(bottom = 20.dp)) {
            StatisticsCard("Наша прибыль", ">5 400 000", "кредитов", Modifier, shapeCard2)
        }
        Column (modifier = Modifier.padding(bottom = 20.dp)) {
            StatisticsCard("Наши партнёры", "1 500+", "партнеров", Modifier, shapeCard)
        }
        Column {
            Row {
                Text(text = stringResource(R.string.footer_title))
                JetRoundIcon(R.drawable.ic_launcher_foreground,Modifier)
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