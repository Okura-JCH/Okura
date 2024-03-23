package com.example.okura.domain.data.repository

import com.example.okura.domain.data.api.RetrofitInstance
import com.example.okura.domain.model.NewsItem

class NewsRepository {
    suspend fun getArticles(): List<NewsItem> {
        return RetrofitInstance.api.getArticles()
    }
}
