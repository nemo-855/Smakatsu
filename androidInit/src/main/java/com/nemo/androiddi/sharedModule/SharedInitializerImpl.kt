package com.nemo.androiddi.sharedModule

import com.nemo.shareddata.di.initSharedModuleDi

class SharedInitializerImpl : SharedInitializer {
    override fun init() {
        initSharedModuleDi()
    }
}