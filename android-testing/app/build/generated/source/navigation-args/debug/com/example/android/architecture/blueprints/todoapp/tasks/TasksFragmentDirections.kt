package com.example.android.architecture.blueprints.todoapp.tasks

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.android.architecture.blueprints.todoapp.R
import kotlin.Int
import kotlin.String

class TasksFragmentDirections private constructor() {
    private data class ActionTasksFragmentToTaskDetailFragment(val taskId: String) : NavDirections {
        override fun getActionId(): Int = R.id.action_tasksFragment_to_taskDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("taskId", this.taskId)
            return result
        }
    }

    private data class ActionTasksFragmentToAddEditTaskFragment(val taskId: String?, val title:
            String) : NavDirections {
        override fun getActionId(): Int = R.id.action_tasksFragment_to_addEditTaskFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("taskId", this.taskId)
            result.putString("title", this.title)
            return result
        }
    }

    companion object {
        fun actionTasksFragmentToStatisticsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_tasksFragment_to_statisticsFragment)

        fun actionTasksFragmentToTaskDetailFragment(taskId: String): NavDirections =
                ActionTasksFragmentToTaskDetailFragment(taskId)

        fun actionTasksFragmentToAddEditTaskFragment(taskId: String?, title: String): NavDirections
                = ActionTasksFragmentToAddEditTaskFragment(taskId, title)
    }
}
