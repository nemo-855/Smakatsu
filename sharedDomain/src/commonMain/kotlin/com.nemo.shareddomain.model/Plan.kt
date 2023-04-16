package com.nemo.shareddomain.model

import kotlinx.datetime.LocalDateTime

class Plan(
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val type: PlanType
)