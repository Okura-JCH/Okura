package com.example.okura.presentation.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.okura.domain.model.BottomNavBarItem

@Composable
fun NavigationBarItems(
    selectedItem: Int,
    onItemSelect: (Int, String) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavigationBar {
        BottomNavBarItem.values().forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = { onItemSelect(index, item.route) },
            )
        }
    }
}
