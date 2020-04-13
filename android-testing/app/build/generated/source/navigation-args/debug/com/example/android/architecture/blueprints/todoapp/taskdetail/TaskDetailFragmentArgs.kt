package com.example.android.architecture.blueprints.todoapp.taskdetail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class TaskDetailFragmentArgs(val taskId: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("taskId", this.taskId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): TaskDetailFragmentArgs {
            bundle.setClassLoader(TaskDetailFragmentArgs::class.java.classLoader)
            val __taskId : String?
            if (bundle.containsKey("taskId")) {
                __taskId = bundle.getString("taskId")
                if (__taskId == null) {
                    throw IllegalArgumentException("Argument \"taskId\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"taskId\" is missing and does not have an android:defaultValue")
            }
            return TaskDetailFragmentArgs(__taskId)
        }
    }
}
