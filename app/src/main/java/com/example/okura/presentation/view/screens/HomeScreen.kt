package com.example.okura.presentation.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.okura.domain.data.sampleNewsItems
import com.example.okura.presentation.components.HomeAppBar
import com.example.okura.presentation.components.NavigationBarItems
import com.example.okura.presentation.components.carousel.ArticleCarousel
import com.example.okura.presentation.components.carousel.CarouselDescription
import com.example.okura.presentation.components.feed.NewsFeed
import com.example.okura.ui.theme.OkuraTheme

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    Scaffold(
        modifier = modifier,
        topBar = {
            HomeAppBar(
                title = { Text(text = "Okura") },
            )
        },
        bottomBar = {
            NavigationBarItems(selectedItem = selectedItem) { index, itemRoute ->
                selectedItem = index
                navController.navigate(itemRoute) {
                    popUpTo(navController.graph.startDestinationId) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        },
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            CarouselDescription()
            ArticleCarousel(pageCount = 10)
            Spacer(modifier = Modifier.height(32.dp))
            NewsFeed(newsItems = sampleNewsItems)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    OkuraTheme {
        val navController = rememberNavController() // dummy navController for preview
        HomeScreen(navController = navController)
    }
}

@Preview
@Composable
private fun HomeAppBarPreview() {
    HomeAppBar(title = { /*TODO*/ })
}
