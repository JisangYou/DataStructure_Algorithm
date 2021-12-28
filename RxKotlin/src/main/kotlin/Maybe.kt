import io.reactivex.rxjava3.core.Maybe

fun main() {
    Maybe.just(1)
        .subscribe(
            { println("onSuccess $it") },
            { println("onComplete") },
            { println("onError") }
        )
}