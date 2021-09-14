import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Sample1Test {

    private val testSample: Sample1 = Sample1()

    @Test
    fun testSum1() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

    @Test
    fun testSum2() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 1))
    }
}