package com.nemo.shared.data.db

import com.nemo.shared.domain.model.Log
import kotlinx.datetime.LocalDate

class LogDao(
    dbService: DatabaseService
) {
    val db: SmakatsuDB = dbService.database

    fun insert(log: Log) {
        db.smakatsudbQueries.insertLog(
            log.startTime.toString(),
            log.endTime.toString(),
            log.startTime.date.toString(),
        )
    }
}
