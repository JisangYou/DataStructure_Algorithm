package com.example.testingsample.di//package com.example.testingsample

import com.example.testingsample.Calculator
import com.example.testingsample.calculator.CalculatorViewModelFactory
import com.example.testingsample.calculator.CalculatorViewModelFactoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideCalculatorViewModelFactory(calculator: Calculator): CalculatorViewModelFactory =
        CalculatorViewModelFactoryImpl(calculator)
}