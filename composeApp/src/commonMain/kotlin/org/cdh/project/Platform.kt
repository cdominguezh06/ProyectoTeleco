package org.cdh.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform