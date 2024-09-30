package com.example.valuuttamuunnin

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Output(output: String) {

    Spacer(modifier = Modifier.padding(12.dp))
    Text(
        text = output,
        style = TextStyle(
            fontSize = 24.sp
        ),
        modifier = Modifier.background(Color.White).padding(16.dp)

    )
}