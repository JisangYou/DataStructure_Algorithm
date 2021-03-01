package com.example.rxkotlin.Future

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class FutureSample {

    val future: Future<String> = object : Future<String> {
        override fun isDone(): Boolean {

            return true
        }

        override fun get(): String {
            return "Hello From Future"
        }

        override fun get(timeout: Long, unit: TimeUnit?): String {
            return "Hello From Future"
        }

        override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
            return false
        }

        override fun isCancelled(): Boolean {
            return false
        }
    }

}