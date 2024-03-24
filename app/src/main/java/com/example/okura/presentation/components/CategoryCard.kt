package com.example.okura.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.okura.domain.model.NewsCategory

@Composable
fun CategoryCard(
    category: NewsCategory,
    modifier: Modifier = Modifier,
) {
    ElevatedCard(
        shape = RoundedCornerShape(8.dp),
        modifier =
            modifier
                .padding(8.dp)
                .size(200.dp),
    ) {
        Column(
            modifier = Modifier,
        ) {
            Image(
                painter = rememberAsyncImagePainter(category.imageUrl),
                contentDescription = "eyecatch image",
                modifier =
                    Modifier
                        .height(150.dp)
                        .width(200.dp)
                        .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = category.name,
                style = MaterialTheme.typography.bodyLarge,
                modifier =
                    Modifier
                        .padding(8.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCategoryCard() {
    CategoryCard(
        category =
            NewsCategory(
                id = 0,
                name = "カテゴリー名",
                imageUrl = "https://picsum.photos/200/300?random=1",
            ),
        modifier = Modifier,
    )
}
