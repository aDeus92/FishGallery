package com.adeus.fishgallery.ui.theme.screens.catchs.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.OnPrimaryColor
import com.adeus.fishgallery.ui.theme.PrimaryColor
import com.adeus.fishgallery.ui.theme.components.JetIconButton

@Composable
fun CatchViewDisplay() {
    val fishList = listOf(
        "file:///android_asset/image/fish1.jpg",
        "file:///android_asset/image/fish2.jpg",
        "file:///android_asset/image/fish3.jpg"
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .verticalScroll(state = rememberScrollState(), true),
       horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp)
        ){
            JetIconButton(
                R.drawable.ic_left,
                Modifier,
                RoundedCornerShape(1.dp),
                PaddingValues(10.dp)
            )

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Наш улов",
                color = OnPrimaryColor,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                textAlign = TextAlign.Center
            )
        }
        CatchCard("Призрачный дельфин","50 000 000 тонн", fishList[0], Modifier)
        CatchCard("Алмазный ус","48 000 000 тонн", fishList[1], Modifier)
        CatchCard("Шестипервая акула","10 000 000 тонн", fishList[2], Modifier)
    }
}