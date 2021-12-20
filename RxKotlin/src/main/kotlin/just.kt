import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1,2,3)
        .subscribe(::println)
}