package io.mhdkhubbi.noteapp.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destinations(
    val label: String,
    val contentDescription: String,
    val icon: ImageVector
){
    HOME("Home", "Home screen", Icons.Default.Home),
    SEARCH("Search", "Search screen", Icons.Default.Search),
    SETTINGS("Settings", "Settings screen", Icons.Default.Settings),
}