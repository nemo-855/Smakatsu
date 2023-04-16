package com.nemo.shareddata.di

import org.koin.core.context.startKoin

actual fun initSharedModuleDi() {
    startKoin {
        modules(listOf(sharedModule, androidModule))
    }
}