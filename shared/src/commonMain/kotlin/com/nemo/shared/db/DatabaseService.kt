package com.nemo.shareddata.db

class DatabaseService(
    driverFactory: DriverFactory,
) {
    val database: SmakatsuDB = SmakatsuDB(driver = driverFactory.createDriver())
}
