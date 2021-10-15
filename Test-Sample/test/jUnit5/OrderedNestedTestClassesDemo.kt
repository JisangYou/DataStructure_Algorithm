package jUnit5

import org.junit.jupiter.api.*


@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class OrderedNestedTestClassesDemo {
    @Order(2)
    @Test
    fun test1() {
        println("hello")
    }

    @Order(1)
    @Test
    fun test2() {
        println("world")
    }
}