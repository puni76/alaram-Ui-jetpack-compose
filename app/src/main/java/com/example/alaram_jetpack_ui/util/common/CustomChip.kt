package com.example.alaram_jetpack_ui.util.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.alaram_jetpack_ui.ui.theme.LightPink

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomChip(
    label: String, selected: Boolean, modifier: Modifier = Modifier, onChipChange: (String) -> Unit
) {
    Chip(
        onClick = {
            onChipChange(label)
        },
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .width(150.dp)
            .height(35.dp),
        colors = ChipDefaults.chipColors(
            backgroundColor = if (selected) Color.Black else LightPink.copy(alpha = 0.2f),
            contentColor = if (selected) Color.White else Color.Black
        ),
    ) {
        Box(
            modifier = modifier.fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Text(text = label)
        }
    }

}