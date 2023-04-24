package com.nemo.shared.di

import android.content.Context
import com.nemo.shareddata.di.androidModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

actual class SharedModuleInitializer(private val context: Context) {
    actual fun initSharedModuleDi() {
        startKoin {
            androidContext(context)
            modules(listOf(sharedModule, androidModule))
        }
    }
}