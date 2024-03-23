package com.example.okura.presentation.components.feed

import NewsViewModel
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun NewsFeed(
    newsViewModel: NewsViewModel,
    modifier: Modifier = Modifier,
) {
    val newsItems by newsViewModel.articles.collectAsState() // ViewModelからニュースアイテムのリストを取得
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier,
    ) {
        items(newsItems) { newsItem ->
            NewsCard(item = newsItem)
        }
    }
}
