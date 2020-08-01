/**
 * interface
 * extends or implements 대신 : 를 사용한다.
 * 무조건 override 변경자를 사용해야한다.
 */
class Btn : Clickable2, Focusable {
    override fun click() =
        println("I was clicked")

    override fun showOff() {
//        super.showOff()
        /**
         * 아래와 같이 구체적으로 어떤 상위 타입의 메소드를 호출할지 지정할 수 있다.
         */
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

/**
 * fragile base class
 * 취약한 기반 클래스 (open, final, abstract)
 * 협업간 혹은 프로젝트가 커지는 경우, 이슈가 될 수 있기에, final
 */

open class RichBtn : Clickable2{

    fun disable(){} // 파이널, 하위클래스가 이 메소드를 오버라이드 할 수 없다.

    open fun animate(){} // 이 함수는 열려있음. 하위 클래스에서 이 메소드를 오버라이드해도 됨.

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main() {
    println(Btn().click())
    val btn = Btn()
    btn.showOff()
    btn.setFocus(true)
    btn.click()
}