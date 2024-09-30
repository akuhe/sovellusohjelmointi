package com.example.valuuttamuunnin

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Button1(buttonText: String){

    Spacer(modifier = Modifier.padding(12.dp))
    Button(onClick = {}){
        Text(text = buttonText)
    }

}