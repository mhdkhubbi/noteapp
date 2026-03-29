package io.mhdkhubbi.noteapp.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(24.dp), // 1.5rem fallback
    large = RoundedCornerShape(32.dp),  // 2rem (rounded-lg)
    extraLarge = RoundedCornerShape(48.dp) // 3rem (rounded-xl)
)