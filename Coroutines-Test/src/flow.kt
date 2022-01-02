import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() = runBlocking {
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Collect the flow
    simple().collect { value -> println(value) }

    (1..3).asFlow().collect { it ->
        println(it)
    }
}

// suspending 함수를 이용하여 비동기적으로 값을 계산
// Flow를 이용하여 비동기적으로 계산된 값을 하나씩 스트림 형태로 받을 수 있음.