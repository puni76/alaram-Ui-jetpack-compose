package com.example.alaram_jetpack_ui.util.common

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@SuppressLint("ModifierParameter")
@Composable
fun CommonLine(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
    backgroundColor: Color = Color.LightGray,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .width(width)
            .height(height)
    )
}