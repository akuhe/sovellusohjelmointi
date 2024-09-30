package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           WeatherApp()
            }
        }
    }

@Composable
fun WeatherApp(){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header("Sääsovellus")
        Spacer(modifier = Modifier.padding(12.dp))
        Picture()
        Spacer(modifier = Modifier.padding(12.dp))
        Desc("Tänään sataa.")
        Spacer(modifier = Modifier.padding(12.dp))
        Temp("10°C")
        Spacer(modifier = Modifier.padding(12.dp))
        Wind("12 m/s")
        Spacer(modifier = Modifier.padding(12.dp))
        Refresh()
        }

}