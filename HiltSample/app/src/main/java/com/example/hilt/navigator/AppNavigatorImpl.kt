package com.example.hilt.navigator

import android.app.Activity
import androidx.fragment.app.FragmentActivity
import com.example.hilt.R
import com.example.hilt.ui.ButtonsFragment
import com.example.hilt.ui.LogsFragment
import kotlinx.android.synthetic.main.activity_main.view.*

class AppNavigatorImpl(private val activity: FragmentActivity) : AppNavigator {
    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.BUTTONS -> ButtonsFragment()
            Screens.LOGS -> LogsFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }

}