package com.damaris.ecommerce_vyza.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.damaris.ecommerce_vyza.R
import com.damaris.ecommerce_vyza.ui.components.ProfilePhoto

@Composable
fun HomeItemScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 40.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .background(Color.Cyan, RoundedCornerShape(30.dp)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Cyan, RoundedCornerShape(30.dp))
                        .fillMaxHeight()
                        .wrapContentSize(Alignment.Center)
                ) {
                    ProfilePhoto(
                        modifier = Modifier.size(64.dp)
                    )
                }
                Text(
                    text = "Guido Girardo",
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                        .background(Color.Cyan, RoundedCornerShape(30.dp))
                        .wrapContentSize(Alignment.Center),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .wrapContentSize(Alignment.Center)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Enviar mensaje al vendedor",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(20.dp))
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(420.dp)
                .background(Color.Red, RoundedCornerShape(20.dp))
                .padding(30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Foto de perfil del vendedor",
                modifier = Modifier
                    .size(220.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(Color.Cyan, RoundedCornerShape(15.dp))
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "table",
                    style = TextStyle(fontSize = 20.sp)
                )
                Text(
                    text = "-",
                    style = TextStyle(fontSize = 20.sp)
                )
                Text(
                    text = "$250",
                    style = TextStyle(fontSize = 20.sp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan, RoundedCornerShape(10.dp)),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Cyan, RoundedCornerShape(10.dp))
                        .fillMaxHeight()
                        .wrapContentSize(Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "Foto de perfil del vendedor"
                    )
                }
                Text(
                    text = "Guido Girardo",
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                        .background(Color.Cyan, RoundedCornerShape(30.dp))
                        .wrapContentSize(Alignment.Center),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Descripcion:",
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Descripcion completa..."
            )
        }

    }
}