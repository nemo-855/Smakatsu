package com.nemo.androidui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nemo.androidui.designsystem.SmakatsuTheme
import com.nemo.androidui.top.TopNavGraph
import com.nemo.androidui.top.topNavGraph

@Composable
fun SmakatsuRoot() {
    SmakatsuTheme {
        NavHost(
            modifier = Modifier,
            navController = rememberNavController(),
            startDestination = TopNavGraph.topRoute
        ) {
            topNavGraph()
        }
    }
}