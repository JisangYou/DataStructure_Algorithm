package com.example.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


class LogApplication : Application() {

    lateinit var serviceLocator: ServiceLocator

    override fun onCreate() {
        super.onCreate()
        serviceLocator = ServiceLocator(applicationContext)
    }
}