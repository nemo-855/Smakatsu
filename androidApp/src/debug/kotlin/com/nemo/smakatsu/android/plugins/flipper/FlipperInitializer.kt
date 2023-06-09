package com.nemo.smakatsu.android.plugins.flipper

import android.content.Context
import com.nemo.smakatsu.android.BuildConfig
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.databases.DatabasesFlipperPlugin
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin
import com.facebook.soloader.SoLoader

fun Context.initFlipper() {
    SoLoader.init(this, false)

    if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
        val client = AndroidFlipperClient.getInstance(this)
        client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
        client.addPlugin(DatabasesFlipperPlugin(this))
        client.addPlugin(NetworkFlipperPlugin())

        client.start()
    }
}
