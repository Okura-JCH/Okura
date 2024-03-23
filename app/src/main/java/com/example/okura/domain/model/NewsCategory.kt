package com.example.okura.domain.model

data class NewsCategory(
    val id: Int,
    val name: String,
    val imageUrl: String,
) {
    companion object {
        val newsCategories =
            listOf(
                // imageUrlは適切なものをそれぞれ後ほど見繕いたい
                NewsCategory(1, "Science", "https://picsum.photos/200/300?random=1"),
                NewsCategory(2, "Technology", "https://picsum.photos/200/300?random=2"),
                NewsCategory(3, "Business", "https://picsum.photos/200/300?random=3"),
                NewsCategory(4, "Entertainment", "https://picsum.photos/200/300?random=4"),
                NewsCategory(5, "Health", "https://picsum.photos/200/300?random=5"),
                NewsCategory(6, "Sports", "https://picsum.photos/200/300?random=6"),
                NewsCategory(7, "General", "https://picsum.photos/200/300?random=7"),
            )
    }
}
