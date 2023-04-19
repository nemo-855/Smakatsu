package com.nemo.androidui.top

import kotlinx.datetime.LocalDateTime
import com.nemo.shareddata.model.Plan

sealed interface TopUiModel {
    data class PieChartUiModel(
        val currentTime: LocalDateTime,
        val plans: List<Plan>
    ) : TopUiModel
}

