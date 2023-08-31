package com.example.alaram_jetpack_ui.util.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.alaram_jetpack_ui.ui.theme.DarkPink
import com.example.alaram_jetpack_ui.ui.theme.LightPink

@Composable
fun CustomToggleButton(
    selected: Boolean,
    modifier: Modifier = Modifier,
    onUpdate: (Boolean) -> Unit
) {

    Card(
        modifier = modifier
            .width(50.dp)
            .noRippleEffect {
                onUpdate(!selected)
            }, shape = RoundedCornerShape(16.dp),
    ) {
        Box(
            modifier = Modifier.background(
                if (selected) DarkPink else LightPink.copy(0.4f)
            ), contentAlignment = if (selected) Alignment.TopEnd else Alignment.TopStart
        ) {
            CheckCircle(modifier = Modifier.padding(5.dp))
        }
    }

}