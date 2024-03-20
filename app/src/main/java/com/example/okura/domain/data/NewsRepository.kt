package com.example.okura.domain.data
import com.example.okura.domain.model.NewsItem

val newsList = List(40) {
    NewsItem(
        id = it,
        title = "$it",
        description = "$it"
    )
}
