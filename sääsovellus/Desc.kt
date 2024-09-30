package com.example.weatherapp

import android.graphics.Paint.Style
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp


@Composable
fun Desc(desc: String){

    Text(
        text = desc,
        style = TextStyle(
            fontSize = 24.sp
        )
    )
}