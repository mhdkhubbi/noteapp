package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavKey
import io.mhdkhubbi.noteapp.database.SavingDataViewModel
import io.mhdkhubbi.noteapp.ui.navigation.Editing
import io.mhdkhubbi.noteapp.ui.screens.components.NoteItem
import io.mhdkhubbi.noteapp.ui.screens.components.SearchBar
import org.koin.androidx.compose.koinViewModel

@Composable
fun NormalScreen(
    modifier: Modifier = Modifier, onNav: (NavKey) -> Unit,
    viewModel: SavingDataViewModel = koinViewModel()
) {
    val allNotes by viewModel.allNotes.observeAsState(listOf())

    Column(
        modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 5.dp),
    ) {
        Text(
            "My Garden of Thoughts",
            fontSize = 34.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(Modifier.height(10.dp))
        SearchBar()
        Spacer(Modifier.height(10.dp))
        LazyColumn() {
            items(allNotes) { note ->
                NoteItem(note.noteTitle, note.noteText)

            }
        }
       // Spacer(Modifier.weight(1f))
        Row(Modifier.padding(bottom = 10.dp)) {
            Spacer(Modifier.weight(1f))
            FloatingActionButton(onClick = {
                onNav(Editing)
            }) {
                Icon(Icons.Default.Add, contentDescription = null)

            }
        }


    }
}