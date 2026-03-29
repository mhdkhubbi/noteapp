package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.mhdkhubbi.noteapp.ui.screens.components.SearchBar

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp,top = 20.dp)) {
        SearchBar()
    }

}