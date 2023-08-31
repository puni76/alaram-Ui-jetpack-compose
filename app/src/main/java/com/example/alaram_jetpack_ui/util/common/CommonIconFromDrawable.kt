package com.example.alaram_jetpack_ui.util.common

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@SuppressLint("ModifierParameter")
@Composable
fun CommonIconFromDrawable(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    IconButton(
        onClick = { onClick() }, modifier = modifier.size(24.dp)
    ) {
        Icon(painter = painterResource(id = icon), contentDescription = "", tint = tint)
    }

}