package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import io.mhdkhubbi.noteapp.database.Note
import io.mhdkhubbi.noteapp.database.SavingDataViewModel
import io.mhdkhubbi.noteapp.ui.navigation.Normal
import org.koin.androidx.compose.koinViewModel

@Composable
fun EditingScreen(
    modifier: Modifier = Modifier, onNav: (NavKey) -> Unit,
    viewModel: SavingDataViewModel = koinViewModel()
) {
    var title by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }
    Column(
        modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 5.dp),
    ) {


        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth(),
            maxLines = 3,
        )
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Text") },
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp),
            maxLines = Int.MAX_VALUE
        )
        Spacer(Modifier.weight(1f))
        Row(Modifier.padding(bottom = 10.dp)) {
            Spacer(Modifier.weight(1f))
            FloatingActionButton(onClick = {
                viewModel.insertNote(
                    Note(
                        noteTitle = title, noteText = text
                    )
                )
                onNav(Normal)
            }) {
                Icon(Icons.Default.Save, contentDescription = null)

            }

        }


    }
}