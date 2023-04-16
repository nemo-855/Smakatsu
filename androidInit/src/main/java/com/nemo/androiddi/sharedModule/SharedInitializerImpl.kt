package com.nemo.androiddi.sharedModule

import com.nemo.shareddata.di.InterfaceProvider
import com.nemo.shareddata.di.initSharedModuleDi

class SharedInitializerImpl : SharedInitializer {
    override fun init() {
        initSharedModuleDi()
        InterfaceProvider.provideSharedModuleInitializer().init()
    }
}