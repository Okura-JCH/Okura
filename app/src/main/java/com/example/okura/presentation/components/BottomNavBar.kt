package com.example.okura.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBar(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items =
        listOf(
            "Home",
            "Articles",
            "People",
            "Settings",
        )

    NavigationBar(modifier = modifier) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Home, contentDescription = item) },
                label = { Text("home") },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Search, contentDescription = item) },
                label = { Text("search") },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Person, contentDescription = item) },
                label = { Text("person") },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Settings, contentDescription = item) },
                label = { Text("settings") },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
        }
    }
}

@Preview
@Composable
private fun PreviewNavBar() {
    val navController = rememberNavController()
    NavBar(navController = navController)
}
