package jUnit5

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledOnOs
import org.junit.jupiter.api.condition.OS


// 선택적인 테스트가 가능
@Disabled("Disabled until bug #99 has been fixed")
internal class DisablingTest {
    @Test
    fun testWillBeSkipped() {
    }

    @Test
    fun testWillBeExecuted() {
    }

    // os 선택 가능
    @Test
    @EnabledOnOs(OS.MAC)
    fun onlyOnMacOs() {
        // ...
    }

}