package com.nemo.smakatsu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform