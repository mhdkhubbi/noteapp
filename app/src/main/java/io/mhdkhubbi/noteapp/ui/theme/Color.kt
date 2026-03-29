package io.mhdkhubbi.noteapp.ui.theme

import androidx.compose.ui.graphics.Color

// Primary Branding & Gradients
val ForestGreen = Color(0xFF14422D) // primary
val DeepSage = Color(0xFF2D5A43)    // primaryContainer
val SoftMint = Color(0xFFC2E9C9)    // secondaryContainer
val MossText = Color(0xFF486A51)    // onSecondaryContainer
val MintDim = Color(0xFFA1D1B4)     // primaryFixedDim

// Surface Hierarchy (The "No-Line" Rule)
val BaseCanvas = Color(0xFFF8FAF8)          // surface
val SidebarSurface = Color(0xFFF2F4F2)      // surfaceContainerLow
val CardSurface = Color(0xFFFFFFFF)         // surfaceContainerLowest
val SearchInputSurface = Color(0xFFE6E9E7)  // surfaceContainerHigh
val SurfaceBright = Color(0xFFFCFDFC)      // surfaceBright

// Text & Details
val DeepCharcoal = Color(0xFF191C1B)        // onSurface
val MutedLeaf = Color(0xFF414943)           // onSurfaceVariant
val GhostOutline = Color(0xFFC0C9C1)        // outlineVariant (used at 15% alpha)

// Signature Gradient
val PrimaryGradient = listOf(ForestGreen, DeepSage)

// Night Garden (Dark Mode) Tokens
val NightForest = Color(0xFF0D1F16)         // surface (Deepest green-black)
val ObsidianGreen = Color(0xFF14291E)      // surfaceContainerLow (Sidebar)
val DeepMossCard = Color(0xFF1B3628)       // surfaceContainerLowest (Notes)
val MutedSageInput = Color(0xFF244234)     // surfaceContainerHigh (Search)
val SurfaceNightBright = Color(0xFF2D5A43) // surfaceBright

val PaleMint = Color(0xFFA1D1B4)           // primary (High contrast for dark)
val LeafContainer = Color(0xFF14422D)      // primaryContainer
val DarkRiverStone = Color(0xFF2D4B3A)     // secondaryContainer
val StoneText = Color(0xFFC2E9C9)          // onSecondaryContainer

val GhostOutlineDark = Color(0xFF3F4943)   // outlineVariant (15% opacity)
val OnSurfaceDark = Color(0xFFE1E3E0)      // High contrast text
val OnSurfaceVariantDark = Color(0xFFAFB3AE) // Secondary text