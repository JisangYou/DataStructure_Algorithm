package com.example.rxkotlin.Observer

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.toObservable
import java.util.*

class Observer {

        val observer: Observer<Any> = object : Observer<Any> {
                override fun onComplete() {
                    println("All Completed")
                }

                override fun onNext(item: Any) {
                    println("Next $item")
                }

                override fun onSubscribe(d: Disposable) {
                    println("Subscribed to $d")
                }

                override fun onError(e: Throwable) {
                    println("Error Occured $e")
                }
            }

}