package com.nemo.shared.data.repository

import com.nemo.shared.domain.model.Log

interface LogRepository {
    suspend fun addLog(log: Log)
}
