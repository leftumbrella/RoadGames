package com.leftumbrella.roadgames.util

class AppUtil {
    fun isOnline(): Boolean {
        val runtime = Runtime.getRuntime()
        try {
            val ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8")
            val exitValue = ipProcess.waitFor()
            return exitValue == 0
        } catch (e: Throwable) {
            e.printStackTrace()
        }
        return false
    }
}