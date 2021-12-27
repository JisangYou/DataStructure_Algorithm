import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 내부적으로 실행중인 코루틴(자식 코루틴)들이 작업을 완료하고 종료 될 때까지 얼마나 대기해야 할 지 부모 코루틴은 예측할 수 없기에
// job 활용
fun main(args: Array<String>) = runBlocking {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join()
}