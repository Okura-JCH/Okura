package com.example.okura.domain.data.api

import com.example.okura.domain.model.NewsItem
import retrofit2.http.GET

interface ApiService {
    @GET("api/v1/articles")
    suspend fun getArticles(): List<NewsItem>
}
