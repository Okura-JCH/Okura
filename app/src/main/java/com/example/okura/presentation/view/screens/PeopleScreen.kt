package com.example.okura.presentation.view.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.okura.presentation.components.bars.HomeAppBar
import com.example.okura.presentation.components.bars.NavigationBarItems
import com.example.okura.ui.theme.OkuraTheme

@Composable
fun PeopleScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    Scaffold(
        modifier = modifier,
        topBar = {
            HomeAppBar(
                title = { Text(text = "記事をさがす") },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "to HomeScreen",
                        )
                    }
                },
            )
        },
        bottomBar = {
            NavigationBarItems(
                selectedItem = selectedItem,
                onItemSelect = { index, route ->
                    selectedItem = index
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
            )
        },
    ) { paddingValues ->
        Text(
            text = "PeopleScreen",
            modifier = Modifier.padding(paddingValues),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PeopleScreenPreview() {
    OkuraTheme {
        val navController = rememberNavController() // dummy navController for preview
        PeopleScreen(navController = navController)
    }
}
