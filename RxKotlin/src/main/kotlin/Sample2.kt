import io.reactivex.rxjava3.core.Observable

val balls = mutableListOf("1", "3", "5")

fun main() {
    Observable.fromIterable(balls).map { it }.subscribe(::println).dispose()
}

