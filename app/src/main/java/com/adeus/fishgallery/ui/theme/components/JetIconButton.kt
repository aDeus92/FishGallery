package com.adeus.fishgallery.ui.theme.components
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.adeus.fishgallery.R
import com.adeus.fishgallery.ui.theme.FishGalleryTheme
import com.adeus.fishgallery.ui.theme.utils.dashedBorder

@Composable
fun JetIconButton(
    drawableId : Int,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentsPadding: PaddingValues
    ){
    Box(
        modifier = modifier
            .dashedBorder(2.dp,Color.DarkGray,shape,4.dp,4.dp)
            .padding(contentsPadding),
        contentAlignment = Alignment.Center,


    ){
        Icon(
            imageVector = ImageVector.vectorResource(id = drawableId),
            contentDescription = "App Icon",
            tint = Color.DarkGray
        )
    }
}

@Preview
@Composable
private fun JetIconBTNPreview(){
    FishGalleryTheme {
        val shapeBtn = RoundedCornerShape(1.dp)
        JetIconButton(R.drawable.ic_left,Modifier,shapeBtn, PaddingValues(5.dp))
    }
}