package com.nemo.shareddata.di

import org.koin.dsl.module

private val sharedModule = module {
    single<SharedModuleInitializer> { SharedModuleInitializerImpl() }
}

fun libraryModules() = listOf(sharedModule)

