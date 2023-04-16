package com.nemo.smakatsu.android

import android.app.Application
import com.nemo.androiddi.sharedModule.SharedInitializer
import com.nemo.androiddi.sharedModule.SharedInitializerImpl
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class SmakatsuApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initSharedModule()
    }

    private fun initSharedModule() {
        val sharedInitializer: SharedInitializer = SharedInitializerImpl()
        sharedInitializer.init()
    }
}
