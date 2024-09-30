package com.example.valuuttamuunnin

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Input(value: String) {

    Spacer(modifier = Modifier.padding(12.dp))
    TextField(value = value, onValueChange = {})

}