package com.piero.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform