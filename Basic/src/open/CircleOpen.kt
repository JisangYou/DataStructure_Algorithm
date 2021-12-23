package open

// 코틀린은 상속 금지가 기준이며, 만약 이를 허용하고 싶을 때는 open 키워드를 사용하여 상속을 허용하게 해준다.
// 상속 측면에서 (final)class             -          open class             -        abstract class
//             상속 불가능, 인스턴스화 가능  -  상속 give&take 가능, 인스턴스화 가능 - 상속을 주는(?) 클래스, 인스턴스화 불가
open class CircleOpen {
    open fun draw() {
        println("draw in CircleOpen")
    }
}

open class OvalOpen : CircleOpen() {
    override fun draw() {
        super.draw()
    }

    open fun drawOval() {
        println("draw in OvalOpen")
    }
}

class Circle : CircleOpen() {
    override fun draw() {
        super.draw()
        println("draw in Circle")
    }
}

fun main() {
//    Circle().draw()
    // abstract 클래스와는 다르게, 인스턴스화가 된다.
//    CircleOpen().draw()
    OvalOpen().draw()
    OvalOpen().drawOval()
}

