import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    // 코루틴 안에서는 runBlocking { } 의 사용은 권장되지 않는다.

    //runBlocking은 호출한 위치를 Blocking 시킨다.
    //runBlocking 내부의 응답이 종료되기 전까지 응답을 주지 않는다.
    //runBlocking은 비동기가 아닌 동기화로 동작
    // https://thdev.tech/kotlin/2020/12/15/kotlin_effective_15/
    runBlocking {
        delay(2000L)
    }
}