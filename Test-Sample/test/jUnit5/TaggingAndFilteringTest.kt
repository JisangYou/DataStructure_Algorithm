package jUnit5

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("fruit")
class TaggingAndFilteringTest {
    @Test
    @Tag("apple")
    fun testingTaxCalculation() {
        println("apple")
    }

    @Test
    @Tag("banana")
    fun testingTaxCalculation2() {
        println("banana")
    }

    @Test
    @Tag("grape")
    fun testingTaxCalculation3() {
        println("grape")
    }
}