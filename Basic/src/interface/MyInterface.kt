package `interface`

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        // optional
        // 구현부에서 무조건 구현안해도 된다.
        print(prop)
    }
}