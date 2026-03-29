package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.mhdkhubbi.noteapp.ui.screens.components.NoteItem
import io.mhdkhubbi.noteapp.ui.screens.components.SearchBar

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        Text("My Garden of Thoughts", fontSize = 34.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(10.dp))
        Text("A curated collection of research, notes, and botanical observations",fontSize = 16.sp)
        SearchBar()
        NoteItem()
    }

}

@Preview
@Composable
private fun HomeScreenPreview() {

    HomeScreen()
}