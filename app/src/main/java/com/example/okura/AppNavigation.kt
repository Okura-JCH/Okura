package com.example.okura

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.okura.presentation.view.screens.HomeScreen
import com.example.okura.presentation.view.screens.PeopleScreen
import com.example.okura.presentation.view.screens.SearchArticleScreen
import com.example.okura.presentation.view.screens.SettingScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("search") { SearchArticleScreen(navController) }
        composable("person") { PeopleScreen(navController) }
        composable("settings") { SettingScreen(navController) }
    }
}
