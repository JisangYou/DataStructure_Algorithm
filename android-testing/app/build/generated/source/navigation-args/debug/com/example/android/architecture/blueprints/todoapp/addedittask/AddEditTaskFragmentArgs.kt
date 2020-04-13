package com.example.android.architecture.blueprints.todoapp.addedittask

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class AddEditTaskFragmentArgs(val taskId: String?, val title: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("taskId", this.taskId)
        result.putString("title", this.title)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): AddEditTaskFragmentArgs {
            bundle.setClassLoader(AddEditTaskFragmentArgs::class.java.classLoader)
            val __taskId : String?
            if (bundle.containsKey("taskId")) {
                __taskId = bundle.getString("taskId")
            } else {
                throw IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue")
            }
            val __title : String?
            if (bundle.containsKey("title")) {
                __title = bundle.getString("title")
                if (__title == null) {
                    throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
            }
            return AddEditTaskFragmentArgs(__taskId, __title)
        }
    }
}
