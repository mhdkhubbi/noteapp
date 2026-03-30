package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import io.mhdkhubbi.noteapp.ui.navigation.Editing
import io.mhdkhubbi.noteapp.ui.navigation.Normal

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val backStack = rememberNavBackStack(Normal)
    val onNav: (NavKey) -> Unit = {
        backStack.add(it)
    }
    val onClearBackStack: () -> Unit = {
        while (backStack.size > 1) {
            backStack.removeLastOrNull()

        }

    }
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Normal> {
                NormalScreen(onNav=onNav)
            }
            entry<Editing> {
              EditingScreen(onNav=onNav)
            }


        })

}

@Preview
@Composable
private fun HomeScreenPreview() {

    HomeScreen()
}