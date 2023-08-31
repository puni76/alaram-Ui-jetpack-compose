package com.example.alaram_jetpack_ui.util.common

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@SuppressLint("ModifierParameter")
@Composable
fun CommonIconFromImageVector(
    icon: ImageVector,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    IconButton(
        onClick = { onClick() }, modifier = modifier.size(24.dp)
    ) {
        Icon(imageVector = icon, contentDescription = "", tint = tint)
    }

}