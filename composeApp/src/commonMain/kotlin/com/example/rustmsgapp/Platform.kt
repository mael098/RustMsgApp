package com.example.rustmsgapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform