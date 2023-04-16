package com.nemo.shareddata.db

import com.squareup.sqldelight.db.SqlDriver

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): SmakatsuDB {
    val driver = driverFactory.createDriver()
    val Database = SmakatsuDB(driver)
    return Database
}
