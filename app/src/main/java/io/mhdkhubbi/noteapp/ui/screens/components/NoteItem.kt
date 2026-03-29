package io.mhdkhubbi.noteapp.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NoteItem(modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxWidth()) {
        Text("Date of note")
        Text("Note Title", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(10.dp))
        Text(
            "1. ditto skd\n" +
                    "2. data store shared preferences",fontSize = 16.sp
        )


    }
}

@Preview
@Composable
private fun NoteItemPreview(){
    NoteItem()
}