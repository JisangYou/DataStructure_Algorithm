import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable

fun main() {
    Single.just(1).subscribe(singleObserver)
}

val singleObserver = object : SingleObserver<Int> {
    override fun onSubscribe(d: Disposable) {
        println(d)
    }

    override fun onSuccess(t: Int) {
        println("onSuccess $t")
    }

    override fun onError(e: Throwable) {
        println("onError $e")
    }
}

