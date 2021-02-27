package com.example.rxkotlin

import com.example.rxkotlin.Observer.Observer
import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable
import org.junit.Test

class ObserverTest {

    @Test
    fun test1() {
        val observable: Observable<Any> =
            listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f).toObservable()

        observable.subscribe(Observer().observer)
    }

    @Test
    fun test2() {

        val observableOnList: Observable<List<Any>> =
            Observable.just(
                listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f),
                listOf("List with Single Item"),
                listOf(1, 2, 3, 4, 5, 6)
            )
        observableOnList.subscribe(Observer().observer)
    }


}