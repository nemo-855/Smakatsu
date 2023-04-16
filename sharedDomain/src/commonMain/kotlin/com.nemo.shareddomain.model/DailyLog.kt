package com.nemo.shareddomain.model

import kotlinx.datetime.LocalDate

class DailyLog(
    val content: LocalDate,
    val plans: List<Plan>,
    val logs: List<Log>,
)