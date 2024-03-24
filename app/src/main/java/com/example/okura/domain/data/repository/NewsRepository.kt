package com.example.okura.domain.data.repository

import com.example.okura.domain.model.NewsItem

val newsList =
    List(40) {
        NewsItem(
            id = it,
            categoryId = it,
            title = "$it",
            description = "$it",
            imageUrl = "https://picsum.photos/200/300?random=$it",
        )
    }
