package com.example.android.architecture.blueprints.todoapp.taskdetail

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.architecture.blueprints.todoapp.R
import kotlin.Int
import kotlin.String

class TaskDetailFragmentDirections private constructor() {
    private data class ActionTaskDetailFragmentToAddEditTaskFragment(val taskId: String?, val title:
            String) : NavDirections {
        override fun getActionId(): Int = R.id.action_taskDetailFragment_to_addEditTaskFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("taskId", this.taskId)
            result.putString("title", this.title)
            return result
        }
    }

    private data class ActionTaskDetailFragmentToTasksFragment(val userMessage: Int = 0) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_taskDetailFragment_to_tasksFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("userMessage", this.userMessage)
            return result
        }
    }

    companion object {
        fun actionTaskDetailFragmentToAddEditTaskFragment(taskId: String?, title: String):
                NavDirections = ActionTaskDetailFragmentToAddEditTaskFragment(taskId, title)

        fun actionTaskDetailFragmentToTasksFragment(userMessage: Int = 0): NavDirections =
                ActionTaskDetailFragmentToTasksFragment(userMessage)
    }
}
