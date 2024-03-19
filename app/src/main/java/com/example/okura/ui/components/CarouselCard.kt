package com.example.okura.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.okura.R

@Composable
fun CarouselCard(item: String) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .size(width = 320.dp, height = 140.dp)
    ) {
        Row {
            Image(painter = painterResource(id = R.drawable.sample), contentDescription = "sample")
            HeadlineTexts()
        }
    }
}

@Composable
fun HeadlineTexts(){
    Column {
        HeadLine(text = "HeadLine")
        SubText(text = "iikanji no subtext will be placed here. Bikkuri suru kurai iikanji ni placed.")
    }
}


@Composable
fun HeadLine(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(8.dp),
        textAlign = TextAlign.Center,
    )
}

@Composable
fun SubText(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(8.dp),
        textAlign = TextAlign.Center,
    )
}
@Preview
@Composable
fun CarouselCardPreview() {
    CarouselCard(item = "Item")
}
