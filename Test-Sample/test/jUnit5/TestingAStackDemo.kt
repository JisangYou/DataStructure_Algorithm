package jUnit5

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.*


@DisplayName("A stack")
class TestingAStackDemo {
    lateinit var stack: Stack<Any>

    @Test
    @DisplayName("is instantiated with new Stack()")
    fun isInstantiatedWithNew() {
        Stack<Any>()
    }

    @Nested
    @DisplayName("when new")
    inner class WhenNew {
        @BeforeEach
        fun createNewStack() {
            stack = Stack<Any>()
        }

        @Test
        @DisplayName("is empty")
        fun isEmpty() {
            assertTrue(stack.isEmpty())
        }

        @Test
        @DisplayName("throws EmptyStackException when popped")
        fun throwsExceptionWhenPopped() {
            assertThrows(EmptyStackException::class.java) { stack.pop() }
        }

        @Test
        @DisplayName("throws EmptyStackException when peeked")
        fun throwsExceptionWhenPeeked() {
            assertThrows(EmptyStackException::class.java) { stack.peek() }
        }

        @Nested
        @DisplayName("after pushing an element")
        inner class AfterPushing {
            var anElement = "an element"

            @BeforeEach
            fun pushAnElement() {
                stack.push(anElement)
            }

            @Test
            @DisplayName("it is no longer empty")
            fun isNotEmpty() {
                assertFalse(stack.isEmpty())
            }

            @Test
            @DisplayName("returns the element when popped and is empty")
            fun returnElementWhenPopped() {
                assertEquals(anElement, stack.pop())
                assertTrue(stack.isEmpty())
            }

            @Test
            @DisplayName("returns the element when peeked but remains not empty")
            fun returnElementWhenPeeked() {
                assertEquals(anElement, stack.peek())
                assertFalse(stack.isEmpty())
            }
        }
    }
}