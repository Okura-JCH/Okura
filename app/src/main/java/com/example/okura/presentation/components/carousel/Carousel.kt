package com.example.okura.presentation.components.carousel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ArticleCarousel(
    modifier: Modifier = Modifier,
    pageCount: Int = 10,
    autoScrollDuration: Long = 3000L,
) {
    val itemList = listOf("1", "2", "3")

    val pagerState =
        rememberPagerState(
            initialPage = 0,
            pageCount = { pageCount },
        )
    val isDragged by pagerState.interactionSource.collectIsDraggedAsState()
    if (!isDragged) {
        var currentPageKey by remember { mutableStateOf(pagerState.currentPage) }
        LaunchedEffect(currentPageKey) {
            delay(autoScrollDuration)
            // 現在のページに1を加え、ページ数で割った余りを次のページインデックスとする
            val nextPage = (pagerState.currentPage + 1) % pageCount
            pagerState.animateScrollToPage(nextPage)
            currentPageKey = nextPage
        }
    }

    HorizontalPager(
        state = pagerState,
        pageSpacing = 0.dp,
        userScrollEnabled = true,
        reverseLayout = false,
        contentPadding = PaddingValues(0.dp),
        beyondBoundsPageCount = 0,
        pageSize = PageSize.Fill,
        flingBehavior = PagerDefaults.flingBehavior(state = pagerState),
        pageContent = {
            CarouselCard(itemList[it % itemList.size]) // itemListからアイテムを取得
        },
    )
}

@Preview
@Composable
private fun ArticleCarouselPreview(modifier: Modifier = Modifier) {
    ArticleCarousel(modifier = modifier)
}
