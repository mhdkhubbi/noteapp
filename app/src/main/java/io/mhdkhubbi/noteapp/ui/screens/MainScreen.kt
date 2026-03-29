package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.mhdkhubbi.noteapp.ui.navigation.Destinations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var destination by rememberSaveable {
        mutableStateOf(Destinations.HOME)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Hi User!")
                }
            )
        },
        bottomBar = {

            Surface(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 8.dp,
                tonalElevation = 3.dp
            ) {
                NavigationBar(
                    containerColor = Color.Transparent,
                    tonalElevation = 0.dp
                ) {
                    Destinations.entries.forEach { dest ->
                        NavigationBarItem(
                            icon = {
                                Icon(
                                    dest.icon,
                                    contentDescription = dest.contentDescription
                                )
                            },
                            label = { Text(dest.label) },
                            selected = dest == destination,
                            onClick = { destination = dest },
//                            colors = NavigationBarItemDefaults.colors(
//                                selectedIconColor = MaterialTheme.colorScheme.primary,
//                                selectedTextColor = MaterialTheme.colorScheme.primary,
//                                unselectedIconColor = Color.DarkGray,
//                                unselectedTextColor = Color.DarkGray,
//                                indicatorColor = Color.Magenta
//                            )
                        )
                    }
                }
            }
        }
    ) { paddingValues ->

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
        ) {
            when (destination) {
                Destinations.HOME -> HomeScreen(Modifier.fillMaxSize())
                Destinations.SEARCH -> SearchScreen(Modifier.fillMaxSize())
                Destinations.SETTINGS -> SettingsScreen(Modifier.fillMaxSize())
            }
        }
    }
}

