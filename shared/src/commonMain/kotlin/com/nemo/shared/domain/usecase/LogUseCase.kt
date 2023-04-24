package com.nemo.shared.domain.usecase

import com.nemo.shared.domain.model.Log
import kotlinx.coroutines.flow.Flow

interface LogUseCase {
    fun addLog(log: Log): Flow<Unit>
}