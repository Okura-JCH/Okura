package com.example.okura.domain.data

import com.example.okura.domain.model.NewsCategory
import com.example.okura.domain.model.NewsItem

fun getImageUrlForCategory(categoryName: String): String {
    val category = NewsCategory.newsCategories.find { it.name == categoryName }
    return category?.imageUrl ?: "デフォルトの画像URL"
}

val newsList =
    List(40) {
        NewsItem(
            id = it,
            categoryId = it % 7 + 1,
            title = "$it",
            description = "$it",
            imageUrl = "https://picsum.photos/200/300?random=$it",
        )
    }
