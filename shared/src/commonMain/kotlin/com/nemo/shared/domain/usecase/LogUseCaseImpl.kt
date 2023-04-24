package com.nemo.shared.domain.usecase

import com.nemo.shared.data.repository.LogRepository
import com.nemo.shared.domain.model.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LogUseCaseImpl(
    private val logRepository: LogRepository
) : LogUseCase {
    override fun addLog(log: Log): Flow<Unit> {
        return flow {
            logRepository.addLog(log = log)
        }
    }
}
