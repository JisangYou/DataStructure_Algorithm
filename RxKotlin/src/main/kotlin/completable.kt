import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.CompletableObserver
import io.reactivex.rxjava3.core.CompletableOnSubscribe
import io.reactivex.rxjava3.disposables.Disposable

fun main() {

}

val completable = object : CompletableObserver{
    override fun onSubscribe(d: Disposable) {
        TODO("Not yet implemented")
    }

    override fun onComplete() {
        TODO("Not yet implemented")
    }

    override fun onError(e: Throwable) {
        TODO("Not yet implemented")
    }

}