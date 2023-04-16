package com.nemo.smakatsu.android

import com.nemo.smakatsu.android.plugins.flipper.initFlipper

class DebugSmakatsuApp : SmakatsuApp() {
    override fun onCreate() {
        super.onCreate()
        initFlipper()
    }
}