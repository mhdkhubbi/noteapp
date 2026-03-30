package io.mhdkhubbi.noteapp.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object Normal: NavKey

@Serializable
data object Reading: NavKey

@Serializable
data object Editing: NavKey