package `interface`


class Child : MyInterface {
    // 코틀린 인터페이스는 프로퍼티를 가질 수 있다.
    override val prop: Int
        get() = TODO("Not yet implemented")

    override fun bar() {
        TODO("Not yet implemented")
    }

    override fun foo() {
        super.foo()
    }
}