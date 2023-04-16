package com.nemo.shareddata.model

import kotlinx.datetime.LocalDate

class Date(
    val content: LocalDate,
    val plans: List<Plan>,
    val logs: List<Log>,
)