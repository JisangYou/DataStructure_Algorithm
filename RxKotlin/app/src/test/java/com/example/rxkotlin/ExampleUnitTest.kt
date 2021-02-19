package com.example.rxkotlin

import com.example.rxkotlin.ReactiveCalculator.ReactiveCalculator
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable
import io.reactivex.subjects.PublishSubject
import org.junit.Test

import org.junit.Assert.*
import java.util.*
import javax.security.auth.Subject

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test1() {
        val list: List<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f)

        var observable = list.toObservable()
        observable.subscribeBy(
            onNext = { print(it) },
            onError = { it.printStackTrace() },
            onComplete = { println("Done!") }
        )
    }

    /**
     * 람다 표현
     */
    @Test
    fun lambda1() {
        val sum = { x: Int, y: Int -> x + y }
        println("Sum ${sum(12, 14)}")
    }

    @Test
    fun lambda2() {
        val anonymousMult = { x: Int -> (Random().nextInt(15) + 1 * x) }
        print("random output ${anonymousMult(2)}")
    }

    /**
     * 순수 함수
     */

    @Test
    fun pureFunc1() {
        println("named pure func square = ${square(3)}")
        val qube = { n: Int -> n * n * n }
        println("lambda pure func qube = ${qube(3)}")
    }

    private fun square(n: Int): Int {
        return n * n
    }

    /**
     * 고차 함수
     */

    @Test
    fun highOrderFunc() {
        highOrderFunc1(12) { a: Int -> a.isEven() }
        highOrderFunc1(19) { a: Int -> a.isEven() }
        highOrderFuncInline1(12) { a: Int -> a.isEven() }
        highOrderFuncInline1(19) { a: Int -> a.isEven() }
    }

    private fun highOrderFunc1(a: Int, validityCheckFunc: (a: Int) -> Boolean) {
        if (validityCheckFunc(a)) {
            println("a $a is Valid")
        } else {
            println("a $a is Invalid")
        }
    }

    private fun Int.isEven() = this % 2 == 0


    /**
     * 인라인 함수
     * -> 프로그램의 성능 및 메모리 최적화를 향상시키는 개선된 기능
     */

    @Test
    fun beforeInlineFunc() {
        for (i in 1..10) {
            println("$i Output ${doSomeStuff(i)}")
        }
    }


    private inline fun highOrderFuncInline1(a: Int, validityCheckFunc: (a: Int) -> Boolean) {
        if (validityCheckFunc(a)) {
            println("a $a is Valid")
        } else {
            println("a $a is Invalid")
        }
    }

    private fun doSomeStuff(a: Int = 0) = a + (a * a)

    /**
     * 계산기 테스
     */
    @Test
    fun calc1() {
        ReactiveCalculator(2,3)
    }

}