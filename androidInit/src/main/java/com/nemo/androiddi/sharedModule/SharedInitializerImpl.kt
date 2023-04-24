package com.nemo.androiddi.sharedModule

import android.content.Context
import com.nemo.shared.di.SharedModuleInitializer

class SharedInitializerImpl : SharedInitializer {
    override fun init(context: Context) {
        SharedModuleInitializer(context).initSharedModuleDi()
    }
}