package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize()) {
        Text("Settings", fontSize = 24.sp)
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Text(
                text = "Account Identity",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
            Row {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "Search", tint = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Spacer(Modifier.width(15.dp))
                Text("Name of User")
            }
            Row {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "Search", tint = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Spacer(Modifier.width(15.dp))
                Text("Name of User")
            }
            Row {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "Search", tint = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Spacer(Modifier.width(15.dp))
                Text("Name of User")
            }

        }
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Text(
                text = "Appearance",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
            Row() {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "Search", tint = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Text("Dark Mode")
                Switch(true, onCheckedChange = {})
            }

        }


    }

}