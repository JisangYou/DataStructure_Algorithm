package jUnit5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestReporter


class TestReporterDemo {
    //TestReporter can be used to publish additional data about the current test run
    @Test
    fun reportSingleValue(testReporter: TestReporter) {
        testReporter.publishEntry("a status message")
    }

    @Test
    fun reportKeyValuePair(testReporter: TestReporter) {
        testReporter.publishEntry("a key", "a value")
    }

    @Test
    fun reportMultipleKeyValuePairs(testReporter: TestReporter) {
        val values: MutableMap<String, String> = HashMap()
        values["user name"] = "dk38"
        values["award year"] = "1974"
        testReporter.publishEntry(values)
    }
}