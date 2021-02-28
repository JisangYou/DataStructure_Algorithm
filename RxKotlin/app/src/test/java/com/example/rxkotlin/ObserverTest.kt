package com.example.rxkotlin


import com.example.rxkotlin.Observer.ObserverSample1
import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable
import org.junit.Test
import java.lang.Exception

class ObserverTest {

    @Test
    fun test1() {
        val observable: Observable<Any> =
            listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f).toObservable()

        observable.subscribe(ObserverSample1().observer)
    }

    @Test
    fun test2() {

        val observableOnList: Observable<List<Any>> =
            Observable.just(
                listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f),
                listOf("List with Single Item"),
                listOf(1, 2, 3, 4, 5, 6)
            )
        observableOnList.subscribe(ObserverSample1().observer)
    }

    @Test
    fun test3() {
        val observable: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onComplete()
        }
        observable.subscribe(ObserverSample1().observer)
    }

    @Test
    fun test4(){
        val observable: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onError(Exception("My Custom Exception"))
        }
        observable.subscribe(ObserverSample1().observer)
    }


}