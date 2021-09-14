package jUnit5

import org.junit.jupiter.api.*


internal class StandardTests {

    companion object {
        // static으로 전환 시 companion object 안에 위치 시키고, @JvmStatic 을 추가한다.
        @BeforeAll
        @JvmStatic
        fun initAll() {
            println("initAll")
        }

        @AfterAll
        @JvmStatic
        fun tearDownAll() {
            println("tearDownAll")
        }
    }

    @BeforeEach
    fun init() {
        println("init")
    }

    @Test
    fun fallingTest() {
        println("fallingTest")
//        fail("a failing test")
    }

    @Test
    @Disabled("for demonstration purposes")
    fun skippedTest() {
        // not executed
        println("skippedTest")
    }

    @Test
    fun abortedTest() {
//        Assertions.assertTrue("abc".contains("Z"))
//        fail("test should have been aborted")
        println("abortedTest")
    }

    @AfterEach
    fun tearDown() {
        println("tearDown")
    }
}