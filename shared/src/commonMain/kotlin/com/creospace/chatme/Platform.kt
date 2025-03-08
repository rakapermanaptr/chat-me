package com.creospace.chatme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform