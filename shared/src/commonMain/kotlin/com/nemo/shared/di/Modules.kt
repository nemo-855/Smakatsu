package com.nemo.shared.di

import com.nemo.shared.data.repository.LogRepository
import com.nemo.shared.data.repository.LogRepositoryImpl
import com.nemo.shared.di.provider.LogUseCaseProvider
import com.nemo.shared.domain.usecase.LogUseCase
import com.nemo.shared.domain.usecase.LogUseCaseImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedModule = module {
    single<LogRepository> { LogRepositoryImpl(get(), get()) }

    single<LogUseCase> { LogUseCaseImpl(get()) }

    singleOf(::LogUseCaseProvider)
}

