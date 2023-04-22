package com.nemo.shared.data.db

class DatabaseService(
    driverFactory: DriverFactory,
) {
    val database: SmakatsuDB = SmakatsuDB(driver = driverFactory.createDriver())
}
