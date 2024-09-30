package com.example.weatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Picture(){

Image(painter = painterResource(id = R.drawable.rain),
    contentDescription = "Sateinen kuva",
    modifier = Modifier.fillMaxWidth().height(180.dp)
)
}