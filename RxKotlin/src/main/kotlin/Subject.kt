import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

// https://velog.io/@cmplxn/RxJava-%EC%9E%85%EB%AC%B8%ED%95%98%EA%B8%B0-Kotlin#disposable
fun main() {
//    val xSubject = PublishSubject.create<Int>() // 구독 시점부터
//    val xSubject = BehaviorSubject.create<Int>() // 구독 시점 직전부터
//    val xSubject = ReplaySubject.create<Int>() // 지금까지 발행된 데이터 모두
    val xSubject = AsyncSubject.create<Int>() // complete 되었을 때 가장 마지막 데이터


    xSubject.subscribe { println("첫번째 $it") }
    xSubject.onNext(1)
    Thread.sleep(1000L)
    xSubject.subscribe { println("----두번째 $it") }
    xSubject.onNext(2)
    xSubject.onNext(3)
    Thread.sleep(1000L)
    xSubject.subscribe { println("********세번째 $it") }
    xSubject.onNext(4)
    xSubject.onComplete()
}
