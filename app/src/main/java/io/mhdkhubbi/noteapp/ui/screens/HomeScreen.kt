package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
        modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp, top = 5.dp),
    ) {
        Text("My Garden of Thoughts", fontSize = 34.sp,lineHeight = 40.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(10.dp))
        SearchBar()
        Spacer(Modifier.height(10.dp))
        NoteItem()
    }

}

@Preview
@Composable
private fun HomeScreenPreview() {

    HomeScreen()
}