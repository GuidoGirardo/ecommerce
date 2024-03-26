package com.damaris.ecommerce_vyza.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import coil.compose.AsyncImage
import com.damaris.ecommerce_vyza.R

@Composable
fun ProfilePhoto(
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = R.drawable.keo,
        contentDescription = stringResource(id = R.string.ps_profile_photo),
        modifier = modifier
            .clip(RoundedCornerShape(50)),
        contentScale = ContentScale.FillBounds
    )
}