package com.nemo.shared.data.db

class LogDao(
    dbService: DatabaseService
) {
    val db = dbService.database
    fun insert() {
        db.smakatsudbQueries
    }
}
