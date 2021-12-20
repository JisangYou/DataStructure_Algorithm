import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

fun main() {
//    Observable
//        .just("Hello?", "RxKotlin~!")
//        .map { it.dropLast(1) }
//        .subscribe(::println)

//    Observable.just(1, 2, 3, 4).subscribe(observer)
    println(disposable)
}


val observer = object : Observer<Int> {
    override fun onComplete() {
        // Observable이 완료된 경우
        println("onComplete")
    }

    override fun onSubscribe(d: Disposable) {
        // Observable이 데이터 전달할 준비가 되었을 때.
        // 작업 취소를 위한 Disposable에 대한 레퍼런스를 여기서 받음
    }

    override fun onNext(t: Int) {
        // Observable이 데이터를 전달할 때 호출
        println("t : $t")
    }

    override fun onError(e: Throwable) {
        // Observable이 에러를 전달할 때 호출. Error시 Complete없이 종료다.
    }
}

val disposable: Disposable = Observable.just(1, 2, 3, 4)
    .subscribe(
        { println("onNext") }, { println("onError") }, { println("onComplete") }
    )