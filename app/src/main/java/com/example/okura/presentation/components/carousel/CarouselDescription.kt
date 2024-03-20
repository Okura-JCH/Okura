package com.example.okura.presentation.components.carousel

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CarouselDescription() {
    Text(
        text = "Our Picks",
        style = MaterialTheme.typography.headlineSmall,
        modifier = Modifier.padding(32.dp, 16.dp, 16.dp, 16.dp)
    )
}
