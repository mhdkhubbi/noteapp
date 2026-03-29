package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.mhdkhubbi.noteapp.ui.screens.components.SearchBar

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        SearchBar()
    }

}