package com.example.hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.LogApplication
import com.example.hilt.R
import com.example.hilt.navigator.AppNavigator
import com.example.hilt.navigator.Screens

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = (applicationContext as LogApplication).serviceLocator.provideNavigator(this)

        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.BUTTONS)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }
    }
}