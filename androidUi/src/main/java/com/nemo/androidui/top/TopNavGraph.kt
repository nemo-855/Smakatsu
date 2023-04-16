package com.nemo.androidui.top

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

internal fun NavGraphBuilder.topNavGraph() {
    composable(route = TopNavGraph.topRoute) {

    }
}

object TopNavGraph {
    const val topRoute = "top"
}