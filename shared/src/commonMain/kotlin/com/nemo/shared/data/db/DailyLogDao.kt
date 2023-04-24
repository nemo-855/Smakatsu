package com.nemo.shared.data.db

import kotlinx.datetime.LocalDate

class DailyLogDao(
    dbService: DatabaseService
) {
    val db: SmakatsuDB = dbService.database

    fun insert(date: LocalDate) {
        db.smakatsudbQueries.insertDailyLog(date.toString())
    }
}
