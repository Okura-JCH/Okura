package com.example.okura.domain.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val logger: HttpLoggingInterceptor =
    HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

val httpClient: OkHttpClient =
    OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.155.153:3000/")
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
}
