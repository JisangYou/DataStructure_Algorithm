import io.reactivex.rxjava3.core.Flowable

fun main() {

    // 데이터의 발행 속도가 구독자의 처리속도보다 크게 빠를 때 사용 (BackPressure Issue)
    // observer 방식으로 consumer 등록시 FlowableSubscriber를 구현해 전달한다.
    // BackPressure Issue를 처리하는 방법을 설정할 수 있다.
    // LiveDataReactiveStreams을 사용해 AAC LiveData와 연계할 수 있다.
    // 출처 : https://velog.io/@cmplxn/RxJava-%EC%9E%85%EB%AC%B8%ED%95%98%EA%B8%B0-Kotlin#disposable
    Flowable.just(1, 2, 3, 4).subscribe(
        {
            println("$it")
        }, {
           println("onError")
        }, {
            println("complete")
        })


}