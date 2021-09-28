package jUnit5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.EnabledIf


internal class ExternalCustomConditionTest{
    @Test
    @EnabledIf("example.ExternalCondition#customCondition")
    fun enabled() {
        // ...
    }

}

internal class ExternalCondition {
    fun customCondition(): Boolean {
        return true
    }
}