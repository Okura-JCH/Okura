package com.example.okura.domain.model
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavBarItem(
    val icon: ImageVector,
    val label: String,
    val route: String,
) {
    Home(
        icon = Icons.Outlined.Home,
        label = "Home",
        route = "home",
    ),
    List(
        icon = Icons.Outlined.Search,
        label = "Search",
        route = "search",
    ),
    People(
        icon = Icons.Outlined.Person,
        label = "Person",
        route = "person",
    ),
    Settings(
        icon = Icons.Outlined.Settings,
        label = "Settings",
        route = "settings",
    ),
}
