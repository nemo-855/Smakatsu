package com.nemo.androiddi.sharedModule

import com.nemo.shared.di.provider.LogUseCaseProvider
import com.nemo.shared.domain.usecase.LogUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideLogUseCase(): LogUseCase {
        return LogUseCaseProvider().provide()
    }
}
