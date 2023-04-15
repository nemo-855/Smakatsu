package com.nemo.androidui.designsystem

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nemo.androidui.R

private val fontFamily = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_italic, style = FontStyle.Italic)
)

val SmakatsuTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    displayMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    displaySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 10.sp
    )
)
