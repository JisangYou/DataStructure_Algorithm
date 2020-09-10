package com.example.hilt.navigator

enum class Screens {
    BUTTONS,
    LOGS
}

interface AppNavigator {
    fun navigateTo(screens: Screens)
}