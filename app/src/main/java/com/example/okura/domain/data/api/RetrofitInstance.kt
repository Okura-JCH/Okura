package com.example.okura.domain.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

val logger: HttpLoggingInterceptor =
    HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

val httpClient: OkHttpClient =
    OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()

// object RetrofitInstance {
//    private val retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl("http://10.155.68.250:3000/")
//            .client(httpClient)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
// }
//    val api: NewsApiService by lazy {
//        retrofit.create(NewsApiService::class.java)
//    }
// }
