import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun listOf() = listOf(1, 2, 3)
fun sequence() = sequence { // cpu 자원을 소모하는 작업
    for (i in 1..3) {
        Thread.sleep(100)
        yield(i)
    }
}

suspend fun suspending(): List<Int> { // 비동기적으로 실행(하나의 값 반환)
    delay(1000)
    return listOf(1, 2, 3)
}

fun flow(): Flow<Int> = flow { // 비동기적으로 계산되는 값의 스트림 처리 (여러 개 반환)
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() {
    listOf().forEach(::println)
    sequence().forEach(::println)
    runBlocking {
        suspending().forEach(::println)
    }
    runBlocking {
        launch {
            for (k in 1..3) {
                println("i'm not blocked $k")
                delay(100)
            }
        }
        flow().collect { value -> println(value) }
    }
}

/**
 * 참고 
 * https://nanamare.tistory.com/175
 */
