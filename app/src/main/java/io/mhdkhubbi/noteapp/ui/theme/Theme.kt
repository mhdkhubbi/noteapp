package io.mhdkhubbi.noteapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = PaleMint,
    onPrimary = NightForest,
    primaryContainer = LeafContainer,
    onPrimaryContainer = Color.White,
    secondaryContainer = DarkRiverStone,
    onSecondaryContainer = StoneText,
    surface = NightForest,
    onSurface = OnSurfaceDark,
    onSurfaceVariant = OnSurfaceVariantDark,
    surfaceContainerLowest = DeepMossCard,
    surfaceContainerLow = ObsidianGreen,
    surfaceContainerHigh = MutedSageInput,
    surfaceBright = SurfaceNightBright,
    outlineVariant = GhostOutlineDark
)

private val LightColorScheme = lightColorScheme(
    primary = ForestGreen, onPrimary = Color.White,
    primaryContainer = DeepSage,
    secondaryContainer = SoftMint,
    onSecondaryContainer = MossText,
    surface = BaseCanvas,
    onSurface = DeepCharcoal,
    onSurfaceVariant = MutedLeaf,
    surfaceContainerLowest = CardSurface,
    surfaceContainerLow = SidebarSurface,
    surfaceContainerHigh = SearchInputSurface,
    surfaceBright = SurfaceBright,
    outlineVariant = GhostOutline
)

@Composable
fun NoteappTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}