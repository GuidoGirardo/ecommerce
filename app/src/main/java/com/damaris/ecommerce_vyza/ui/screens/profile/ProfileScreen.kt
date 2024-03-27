package com.damaris.ecommerce_vyza.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.damaris.ecommerce_vyza.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.damaris.ecommerce_vyza.ui.theme.appText
import com.damaris.ecommerce_vyza.ui.theme.backgroundApp
import com.damaris.ecommerce_vyza.ui.theme.grayApp

@Preview
@Composable
fun ProfileScreen(
    // profileClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundApp)
            .padding(horizontal = 32.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.keo),
            contentScale = ContentScale.Crop,
            contentDescription = "Profile image",
            modifier = Modifier
                .size(222.dp)
                .clip(shape = RoundedCornerShape(92.dp))
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "User", fontSize = 26.sp, color = appText, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "My Products:", fontSize = 26.sp, color = appText, textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(grayApp, RoundedCornerShape(32.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.keo),
                contentDescription = "Foto de perfil del vendedor",
                modifier = Modifier
                    .weight(1f)
                    .padding(15.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(grayApp, RoundedCornerShape(16.dp)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Product", fontSize = 26.sp, color = appText,
                    modifier = Modifier.padding(vertical = 14.dp))
                Text(text = "Price", fontSize = 26.sp, color = appText)
            }
        }
    }
}