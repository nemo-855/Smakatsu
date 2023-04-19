package com.nemo.sharedext

import kotlinx.datetime.LocalDateTime

private const val secondsPerDay = 86400F
fun LocalDateTime.secondsOfDay() = (this.hour * 60 * 60) + (this.minute * 60) + this.second
fun LocalDateTime.percentageToADay() = this.secondsOfDay() / secondsPerDay