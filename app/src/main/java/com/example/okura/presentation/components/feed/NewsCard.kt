package com.example.okura.presentation.components.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.okura.domain.model.NewsItem

@Composable
fun NewsCard(item: NewsItem) {
    ElevatedCard(
        modifier =
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = rememberAsyncImagePainter(item.imageUrl),
                contentDescription = "eyecatch image",
                modifier =
                    Modifier
                        .height(200.dp)
                        .width(400.dp)
                        .fillMaxWidth(),
                contentScale = ContentScale.Crop,
            )
            Text(text = item.title, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = item.description, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun
 PreviewNewsCard() {
    val dummyNewsItem =
        NewsItem(
            id = 1,
            title = "title",
            description = "description",
            imageUrl = "https://picsum.photos/200/300?random=1",
        )
    NewsCard(item = dummyNewsItem)
}
