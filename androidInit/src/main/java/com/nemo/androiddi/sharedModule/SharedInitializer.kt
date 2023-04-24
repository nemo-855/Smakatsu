package com.nemo.androiddi.sharedModule

import android.content.Context

interface SharedInitializer {
    fun init(context: Context)
}