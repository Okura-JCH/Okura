package com.example.okura

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.okura.presentation.view.HomeScreen
import com.example.okura.presentation.view.SearchArticleScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("searchArticles/{/*TODO*/}") { backStackEntry ->
            SearchArticleScreen()
        }
    }
}
