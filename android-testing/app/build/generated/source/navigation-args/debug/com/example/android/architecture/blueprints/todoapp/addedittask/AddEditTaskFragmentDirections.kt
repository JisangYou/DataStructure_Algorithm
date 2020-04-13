package com.example.android.architecture.blueprints.todoapp.addedittask

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.architecture.blueprints.todoapp.R
import kotlin.Int

class AddEditTaskFragmentDirections private constructor() {
    private data class ActionAddEditTaskFragmentToTasksFragment(val userMessage: Int = 0) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_addEditTaskFragment_to_tasksFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("userMessage", this.userMessage)
            return result
        }
    }

    companion object {
        fun actionAddEditTaskFragmentToTasksFragment(userMessage: Int = 0): NavDirections =
                ActionAddEditTaskFragmentToTasksFragment(userMessage)
    }
}
