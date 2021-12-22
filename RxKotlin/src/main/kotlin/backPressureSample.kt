import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers


// 참고 : https://javaexpert.tistory.com/809
fun main() {
//    observable1()
//    observable2()
    flowable1()
}

fun observable1() {
    // 푸시 기반
    Observable.range(1, 999999999)
        .map { MyItem(it) }
        .subscribe { myItem ->
            sleep(50)
            System.out.println("Received MyItem : " + myItem.id)
        }
}

fun observable2() {
    // 비동기 적으로 사용하기 위해 다운 스트림 쓰레드 적용
    Observable.range(1, 999999999)
        .map { MyItem(it) }
        .observeOn(Schedulers.io())
        .subscribe { myItem: MyItem ->
            sleep(50)
            println("Received MyItem : " + myItem.id)
        }

    sleep(Int.MAX_VALUE.toLong())
}

fun flowable1() {
    // BackPressure Issue를 어떻게 처리하는 지 확인
    Flowable.range(1, 999999999)
        .map { MyItem(it) }
        .observeOn(Schedulers.io())
        .subscribe { myItem: MyItem ->
            sleep(50)
            println("Received MyItem : " + myItem.id)
        }

    sleep(Int.MAX_VALUE.toLong())
}

fun sleep(millSeconds: Long) {
    try {
        Thread.sleep(millSeconds)
    } catch (ex: InterruptedException) {
        ex.printStackTrace()
    }
}

class MyItem(val id: Int) {
    init {
        println("Constructing MyItem $id")
    }
}

