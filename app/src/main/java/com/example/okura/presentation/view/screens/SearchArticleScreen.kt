package com.example.okura.presentation.view.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.okura.R
import com.example.okura.presentation.components.articles.CategoryGrid
import com.example.okura.presentation.components.bars.HomeAppBar
import com.example.okura.presentation.components.bars.NavigationBarItems

@Composable
fun SearchArticleScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            HomeAppBar(
                title = {
                    Text(text = stringResource(R.string.search_articles))
                },
                navigationIcon = {
                    IconButton(onClick = { /* もどる∩^ω^∩ */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "arrow back",
                        )
                    }
                },
            )
        },
        bottomBar = {
            var selectedItem by remember { mutableStateOf(0) }
            NavigationBarItems(
                selectedItem = selectedItem,
                onItemSelect = { index, route ->
                    selectedItem = index
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
            )
        },
    ) { paddingValues ->
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
        ) {
            SearchField()
            CategoryGrid()
        }
    }
}

@Composable
fun SearchField(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            modifier
                .fillMaxWidth(),
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(stringResource(R.string.input)) },
            singleLine = true,
            modifier =
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
        )
    }
}
