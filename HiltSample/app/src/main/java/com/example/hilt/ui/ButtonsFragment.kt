package com.example.hilt.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.hilt.LogApplication
import com.example.hilt.R
import com.example.hilt.data.LoggerDataSource
import com.example.hilt.data.LoggerLocalDataSource
import com.example.hilt.di.InMemoryLogger
import com.example.hilt.navigator.AppNavigator
import com.example.hilt.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ButtonsFragment : Fragment() {

    @InMemoryLogger
    @Inject
    lateinit var logger: LoggerDataSource

    @Inject
    lateinit var navigator: AppNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        populateFields(context)
    }

    private fun populateFields(context: Context) {
        logger = (context.applicationContext as LogApplication).serviceLocator.loggerLocalDataSource
        navigator = (context.applicationContext as LogApplication).serviceLocator.provideNavigator(
            activity!!
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.findViewById<Button>(R.id.button1).setOnClickListener {
            logger.addLog("Interaction with 'Button 1'")
            Log.e("check1","1")

        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            logger.addLog("Interaction with 'Button 2'")
            Log.e("check2","2")
        }

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            logger.addLog("Interaction with 'Button 3'")
            Log.e("check3","3")
        }

        view.findViewById<Button>(R.id.all_logs).setOnClickListener {
            navigator.navigateTo(Screens.LOGS)
        }

        view.findViewById<Button>(R.id.delete_logs).setOnClickListener {
            logger.removeLogs()
        }
    }
}