package com.example.android.architecture.blueprints.todoapp

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class NavGraphArgs(val userMessage: Int = 0) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putInt("userMessage", this.userMessage)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): NavGraphArgs {
            bundle.setClassLoader(NavGraphArgs::class.java.classLoader)
            val __userMessage : Int
            if (bundle.containsKey("userMessage")) {
                __userMessage = bundle.getInt("userMessage")
            } else {
                __userMessage = 0
            }
            return NavGraphArgs(__userMessage)
        }
    }
}
