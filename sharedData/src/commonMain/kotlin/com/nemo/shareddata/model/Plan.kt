package com.nemo.shareddata.model

import kotlinx.datetime.LocalDateTime

class Plan(
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val type: PlanType
)