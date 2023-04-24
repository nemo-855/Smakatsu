package com.nemo.shared.di.provider

import com.nemo.shared.domain.usecase.LogUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class LogUseCaseProvider : KoinComponent {
    private val logUseCase: LogUseCase by inject()

    fun provide(): LogUseCase = logUseCase
}