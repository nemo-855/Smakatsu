package com.nemo.shared.domain.model

import kotlinx.datetime.LocalDate

class DailyLog(
    val content: LocalDate,
    val plans: List<Plan>,
    val logs: List<Log>,
)