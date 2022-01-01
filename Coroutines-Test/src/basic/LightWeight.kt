package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(100000) {
        launch {
            delay(1000L)
            println(".")
        }
    }

}