package com.nemo.shared.data.repository

import com.nemo.shared.data.db.DailyLogDao
import com.nemo.shared.data.db.LogDao
import com.nemo.shared.domain.model.Log
import com.nemo.shared.error.AppError
import com.nemo.shared.error.toAppError
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LogRepositoryImpl(
    private val logDao: LogDao,
    private val dailyLogDao: DailyLogDao,
) : LogRepository {
    override suspend fun addLog(log: Log) = withContext(Dispatchers.Default){
        try {
            dailyLogDao.insert(date = log.startTime.date)
        } catch (e: Throwable) {
            if (e.toAppError() !is AppError.DbError.UniqueConstraintException) {
                throw e
            }
        } finally {
            logDao.insert(log = log)
        }
    }
}
