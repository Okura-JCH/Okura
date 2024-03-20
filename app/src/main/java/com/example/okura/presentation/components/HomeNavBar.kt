package com.example.okura.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeNavBar(modifier: Modifier = Modifier) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Articles", "People", "Settings")

    val icons: Map<String, ImageVector> =
        mapOf(
            "Home" to Icons.Filled.Home,
            // needa look for a better
            "Articles" to Icons.Filled.Search,
            "People" to Icons.Filled.Face,
            "Settings" to Icons.Filled.Settings,
        )

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(icons[item] ?: Icons.Filled.Favorite, contentDescription = item)
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
        }
    }
}

@Preview
@Composable
private fun HomeNavBarPreview() {
    HomeNavBar()
}
