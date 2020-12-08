package com.example.testingsample.calculator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testingsample.Calculator


interface CalculatorViewModelFactory : ViewModelProvider.Factory

@Suppress("UNCHECKED_CAST")
class CalculatorViewModelFactoryImpl (
    private val calculator: Calculator
) : CalculatorViewModelFactory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CalculatorViewModel(calculator) as T
    }
}
