package jUnit5

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import java.util.*


@DisplayName("TestInfo Demo")
class TestInfoDemo(testInfo: TestInfo) {
    @BeforeEach
    fun init(testInfo: TestInfo) {
        val displayName = testInfo.displayName
        assertTrue(displayName == "TEST 1" || displayName == "test2()")
    }

    @Test
    @DisplayName("TEST 1")
    @Tag("my-tag")
    fun test1(testInfo: TestInfo) {
        println(testInfo.displayName)
        assertEquals("TEST 1", testInfo.displayName)
        assertTrue(testInfo.tags.contains("my-tag"))
    }

    @Test
    fun test2() {
    }

    init {
        assertEquals("TestInfo Demo", testInfo.displayName)
    }
}