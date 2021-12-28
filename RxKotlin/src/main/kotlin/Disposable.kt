import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable


// Disposable 인터페이스를 이용하여 명시적으로 자원 해제 - 라이프사이클에 맞게 해제
// CompositeDisposable 클래스 이용 - 생성된 모든 Observable 을 안드로이드 라이프사이클에 맞춰 한번에 모두 해제
//
//출처: https://yoon-dailylife.tistory.com/16 [알면 쓸모있는 개발 지식]

fun main() {
    val compositeDisposable = CompositeDisposable()
    compositeDisposable.addAll( // 한개만 등록시 add
        Observable.just(1).subscribe(),
        Single.just(1).subscribe(),
        Maybe.just(1).subscribe()
    )
    compositeDisposable.clear() // 옵져버블 해제, 그러나 재사용은 가능한 상태
    compositeDisposable.dispose() // 재사용할 일 없을 경우.
}