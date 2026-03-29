package io.mhdkhubbi.noteapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import io.mhdkhubbi.noteapp.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val NotoSerifFont = FontFamily(Font(googleFont = GoogleFont("Noto Serif"), fontProvider = provider))
val ManropeFont = FontFamily(Font(googleFont = GoogleFont("Manrope"), fontProvider = provider))

val Typography = Typography(
    // Editorial Voice
    displayLarge = TextStyle(
        fontFamily = NotoSerifFont,
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,
        color = ForestGreen
    ),
    headlineMedium = TextStyle(
        fontFamily = NotoSerifFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        color = ForestGreen
    ),
    // Functional Voice
    bodyLarge = TextStyle(
        fontFamily = ManropeFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = MutedLeaf
    ),
    bodyMedium = TextStyle(
        fontFamily = ManropeFont,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelLarge = TextStyle(
        fontFamily = ManropeFont,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)