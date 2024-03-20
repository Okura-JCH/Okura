package com.example.okura.presentation.components.feed

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.okura.domain.data.newsList
import com.example.okura.domain.model.NewsItem

@Composable
fun NewsFeed(newsItems: List<NewsItem>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(newsItems) { newsItem ->
            NewsCard(item = newsItem)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNewsFeed() {
    NewsFeed(newsList)
}
