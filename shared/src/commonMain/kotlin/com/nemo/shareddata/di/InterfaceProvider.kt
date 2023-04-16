package com.nemo.shareddata.di

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object InterfaceProvider : KoinComponent {
    private val sharedModuleInitializer: SharedModuleInitializer by inject()

    fun provideSharedModuleInitializer() = sharedModuleInitializer
}