package com.example.hilt

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.room.Room
import com.example.hilt.data.AppDatabase
import com.example.hilt.data.LoggerLocalDataSource
import com.example.hilt.navigator.AppNavigator
import com.example.hilt.navigator.AppNavigatorImpl
import com.example.hilt.util.DateFormatter

class ServiceLocator(applicationContext: Context) {

    private val logsDatabase = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java,
        "logging.db"
    ).build()

    val loggerLocalDataSource = LoggerLocalDataSource(logsDatabase.logDao())

    fun provideDateFormatter() = DateFormatter()

    fun provideNavigator(activity: FragmentActivity): AppNavigator {
        return AppNavigatorImpl(activity)
    }


}