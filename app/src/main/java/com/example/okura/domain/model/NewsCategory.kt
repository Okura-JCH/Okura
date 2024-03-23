package com.example.okura.domain.model

data class NewsCategory(
    val name: String,
) {
    companion object {
        val newsCategories =
            listOf(
                NewsCategory("ビジネス"),
                NewsCategory("エンタメ"),
                NewsCategory("行政"),
                NewsCategory("不動産"),
                NewsCategory("子育て"),
                NewsCategory("食品"),
                NewsCategory("テクノロジー"),
            )
    }
}
