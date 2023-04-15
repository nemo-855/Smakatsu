package com.nemo.androidui.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val SmakatsuColorScheme = lightColorScheme(
    primary = SmakatsuColor.Primary,
    primaryContainer = SmakatsuColor.PrimaryVariant,
    secondary = SmakatsuColor.Secondary,
    secondaryContainer = SmakatsuColor.SecondaryVariant,
    background = SmakatsuColor.Background,
    surface = SmakatsuColor.Surface,
    error = SmakatsuColor.Error,
    onPrimary = SmakatsuColor.OnPrimary,
    onSecondary = SmakatsuColor.OnSecondary,
    onBackground = SmakatsuColor.OnBackground,
    onSurface = SmakatsuColor.OnSurface,
    onError = SmakatsuColor.OnError
)

@Composable
fun SmakatsuTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = SmakatsuColorScheme,
        typography = SmakatsuTypography,
        shapes = Shapes(),
        content = content
    )
}