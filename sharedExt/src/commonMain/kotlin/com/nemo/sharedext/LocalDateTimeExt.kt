package com.nemo.sharedext

import kotlinx.datetime.LocalDateTime

fun LocalDateTime.secondsOfDay() = (this.hour * 24 * 60) + (this.minute * 60) + this.second