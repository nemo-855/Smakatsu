package com.nemo.shareddata.di

import org.koin.core.context.startKoin

fun initSharedModuleDi() {
    startKoin {
        modules(libraryModules())
    }
}