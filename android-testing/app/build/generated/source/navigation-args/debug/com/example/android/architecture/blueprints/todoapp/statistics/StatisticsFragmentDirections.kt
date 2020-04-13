package com.example.android.architecture.blueprints.todoapp.statistics

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.android.architecture.blueprints.todoapp.R
import kotlin.Int

class StatisticsFragmentDirections private constructor() {
    private data class ActionStatisticsFragmentToTasksFragment(val userMessage: Int = 0) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_statisticsFragment_to_tasksFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("userMessage", this.userMessage)
            return result
        }
    }

    companion object {
        fun actionStatisticsFragmentToTasksFragment(userMessage: Int = 0): NavDirections =
                ActionStatisticsFragmentToTasksFragment(userMessage)
    }
}
