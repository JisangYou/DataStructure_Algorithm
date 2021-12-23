package abstract


// 추상화를 목적으로 사용하는 클래스, 그 자체로 인스턴스화 할 수 없음.
// 일반 클래스에서 상속해서 인스턴스화 해서 사용할 수 있다.
// 공통으로 사용하려는 컴포넌트 등이 있을 경우 유용하나
// 유연성 측면에서 interface보다 못하다.
// 굳이 사용한다면 통제?하는 목적으로 쓸 수 있을까?

// 출처 : https://kotlinworld.com/226?category=924651
abstract class CircleAbstract {
    val perimeter = 3.14
    abstract val radius1: Float
    abstract val radius2: Float

    fun getSize(): Float = radius1 * radius2
    abstract fun getCircleTypeName(): String
}

class Circle(override val radius1: Float, override val radius2: Float) : CircleAbstract() {
//    override val radius2: Float
//        get() = radius1

    override fun getCircleTypeName(): String {
        return "Circle"
    }

}

fun main() {
    println(Circle(4f, 4f).getCircleTypeName())
    println(Circle(4f, 4f).getSize())
}