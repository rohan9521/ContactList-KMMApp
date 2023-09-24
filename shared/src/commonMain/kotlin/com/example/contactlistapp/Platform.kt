package com.example.contactlistapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform