package jUnit5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.DisabledIf
import org.junit.jupiter.api.condition.EnabledIf


internal class CustomConditionTest {
    @Test
    @EnabledIf("customCondition")
    fun enabled() {
        // ...
    }

    @Test
    @DisabledIf("customCondition")
    fun disabled() {
        // ...
    }

    fun customCondition(): Boolean {
        return true
    }
}