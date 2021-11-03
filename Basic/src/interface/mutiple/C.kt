package `interface`.mutiple

class C : A {
    // bar는 재정의
    override fun bar() {
        print("bar")
    }

    // foo는 이미 정의 되어 있기 때문에.. 재정의는 필요 없음.
}