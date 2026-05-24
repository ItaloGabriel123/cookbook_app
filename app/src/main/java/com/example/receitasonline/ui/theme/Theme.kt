package com.example.receitasonline.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
private val Colors = lightColorScheme(

    primary = Orange500,
    secondary = Red500,
    background = Gray50,
    surface = White
)
@Composable
fun ReceitasTheme(
    content:@Composable () -> Unit
){
    MaterialTheme(
        colorScheme = Colors,
        content = content
    )
}