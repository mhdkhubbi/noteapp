package io.mhdkhubbi.noteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.NoteappTheme
import io.mhdkhubbi.noteapp.ui.screens.MainScreen
import io.mhdkhubbi.noteapp.ui.screens.settings.SettingsScreenViewModel
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewmodel: SettingsScreenViewModel = koinViewModel()
            val isSwitchOn by viewmodel.isSwitchOn.collectAsState()
            NoteappTheme(darkTheme = isSwitchOn) {
                MainScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteappTheme {

    }
}