package io.mhdkhubbi.noteapp.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NoteItem(title: String, text: String) {

    Column(Modifier.fillMaxWidth().padding(top = 5.dp, bottom = 5.dp)) {
        Card(
            Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
            )
        ) {
            Column(Modifier
                .fillMaxWidth()
                .padding(20.dp)) {
//                Box(modifier = Modifier
//                    .padding(top = 5.dp)
//
//                    .background(MaterialTheme.colorScheme.secondaryContainer, RoundedCornerShape(5.dp)),
//                    contentAlignment = Alignment.Center
//                ){
//                    Text("Saved On: 1, Jan, 2025", fontSize = 13.sp,modifier= Modifier.padding(start = 5.dp, end = 5.dp))
//                }
                Spacer(Modifier.height(5.dp))
                Text(title, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.height(10.dp))
                Text(
                    text, fontSize = 16.sp,


                    )
            }
        }


    }
}

