package com.example.okura.domain.model

data class NewsItem(
    val id: Int,
    val category: NewsCategory,
    val imageUrl: String,
    val title: String,
    val description: String,
)
