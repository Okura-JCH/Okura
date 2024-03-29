package com.example.okura.domain.model

data class NewsItem(
    val id: Int,
    val categoryId: Int,
    val imageUrl: String,
    val title: String,
    val description: String,
)
