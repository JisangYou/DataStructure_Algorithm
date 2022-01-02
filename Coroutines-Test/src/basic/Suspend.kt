package basic

import kotlinx.coroutines.*

fun main() = runBlocking {
//    launch {
//        doWorld()
//    }
//    println("Hello,")

    launch(Dispatchers.IO) {
        // 병렬 테스트
//        async { sleep1() }
//        async { sleep2() }


        async { suspend1() }
        async { suspend2() }
    }
    println("start")
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

fun sleep1() {
    Thread.sleep(3000)
    println("sleep1 : (${Thread.currentThread().name})")
    Thread.sleep(3000)
    println("sleep1 : (${Thread.currentThread().name})")
    println("sleep1 Done : (${Thread.currentThread().name}) *****")
}

fun sleep2() {
    Thread.sleep(1000)
    println("sleep2 : (${Thread.currentThread().name})")
    Thread.sleep(3000)
    println("sleep2 : (${Thread.currentThread().name})")
    println("sleep2 Done : (${Thread.currentThread().name}) *****")
}

suspend fun suspend1() { // 중단함수 셋
    delay(3000) // 코루틴 전용 함수
    println("suspend1 : (${Thread.currentThread().name})")
    delay(3000)
    println("suspend1 : (${Thread.currentThread().name})")
    println("suspend1 Done : (${Thread.currentThread().name}) *****")
}

suspend fun suspend2() {
    delay(3000) // 쓰레드가 추가
//    delay(1000) // 기존 쓰레드 활용
    // 병렬로 같이 시작하게 되면 비동기로 쓰레드 하나 더 추가되는 것을 확인~!
    println("suspend2 : (${Thread.currentThread().name})")
    delay(3000)
    println("suspend2 : (${Thread.currentThread().name})")
    println("suspend2 Done : (${Thread.currentThread().name}) *****")
}

// coroutine suspend 함수는 thread 를 block x
// thread를 여러개 만드는 것과는 다르다.