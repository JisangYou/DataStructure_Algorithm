package `interface`.mutiple

class D : A, B {
    // 여러 인터페이스에서 상속하는 경우.
    // 같은 메서드인경우에는 구현하는 법을 정확히 지정해야 됨.
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        TODO("Not yet implemented")
    }
}