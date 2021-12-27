package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 모든 코루틴들은 각자의 스코프를 갖는다.
// launch{ } 코루틴 빌더를 이용하여 새로운 코루틴을 생성하면 현재 위치한 부모 코루틴에 join()을
// 명시적으로 호출할 필요 없이 자식 코루틴들을 실행하고 종료될 때까지 대기 할 수 있다.
fun main(args: Array<String>) = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}