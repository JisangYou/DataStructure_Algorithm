package com.example.rxkotlin


import com.example.rxkotlin.Future.FutureSample
import com.example.rxkotlin.Observer.ObserverSample
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.rxkotlin.toObservable
import org.junit.Test
import java.lang.Exception
import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class ObserverTest {


    private fun observer(): Observer<Any> {
        return ObserverSample().observer
    }

    private fun future(): Future<String> {
        return FutureSample().future
    }

    @Test
    fun test1() {
        val observable: Observable<Any> =
            listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f).toObservable()

        observable.subscribe(observer())
    }

    @Test
    fun test2() {

        val observableOnList: Observable<List<Any>> =
            Observable.just(
                listOf("One", 2, "three", "Four", 4.5, "Five", 6.0f),
                listOf("List with Single Item"),
                listOf(1, 2, 3, 4, 5, 6)
            )
        observableOnList.subscribe(observer())
    }

    /**
     * create 메소드
     */

    @Test
    fun test3() {
        val observable: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onComplete()
        }
        observable.subscribe(observer())
    }

    @Test
    fun test4() {
        val observable: Observable<String> = Observable.create<String> {
            it.onNext("Emit 1")
            it.onNext("Emit 2")
            it.onNext("Emit 3")
            it.onNext("Emit 4")
            it.onError(Exception("My Custom Exception"))
        }
        observable.subscribe(observer())
    }


    /**
     * from 메소드
     */

    @Test
    fun test5() {
        val list = listOf("String 1", "String 2", "String 3", "String 4")
        val observableFromIterable: Observable<String> =
            Observable.fromIterable(list)
        observableFromIterable.subscribe(observer())

    }

    @Test
    fun test6() {
        val callable = Callable<String> { "From Callable" }
        val observableFromCallable: Observable<String> =
            Observable.fromCallable(callable)
        observableFromCallable.subscribe(observer())
    }

    @Test
    fun test7() {
        val observableFromFuture: Observable<String> = Observable.fromFuture(future())
        observableFromFuture.subscribe(observer())
    }

    /**
     * toObservable 확장 함수
     */

    @Test
    fun test8() {
        val list: List<String> = listOf("String 1", "String 2", "String 3", "String 4")
        val observable: Observable<String> = list.toObservable()
        observable.subscribe(observer())
    }

    /**
     * just 메서드
     */

    @Test
    fun test9() {
        Observable.just("A String").subscribe(observer())
    }

    @Test
    fun test10() {
        Observable.just(listOf("String 1", "String 2", "String 3", "String 4"))
            .subscribe(observer())
    }

    @Test
    fun test11() {
        Observable.just(54).subscribe(observer())
    }

    @Test
    fun test12() {
        Observable.just(
            mapOf(
                Pair("Key 1", "Value 1"),
                Pair("Key 2", "Value 2"),
                Pair("Key 3", "Value 3")
            )
        ).subscribe(observer())
    }

    @Test
    fun test13() {
        Observable.just(arrayListOf(1, 2, 3, 4, 5, 6)).subscribe(observer())
    }

    @Test
    fun test14() {
        Observable.just("String 1", "String 2", "String 3").subscribe(observer())
    }

}