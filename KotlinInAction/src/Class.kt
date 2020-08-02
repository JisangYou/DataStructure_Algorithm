import java.io.Serializable

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

open class RichBtn : Clickable2 {

    fun disable() {} // 파이널, 하위클래스가 이 메소드를 오버라이드 할 수 없다.

    open fun animate() {} // 이 함수는 열려있음. 하위 클래스에서 이 메소드를 오버라이드해도 됨.

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

/**
 * open, final, abstract 변경자 : 기본은 final
 * final - 오버라이드 할수 없음 -> 클래스 멤버의 기본 변경자이다.
 * open - 오버라이드 할 수 있음 -> 반드시 open을 명시해야 오버라이드 할 수 있다.
 * abstract - 반드시 오버라이드해야 함 -> 추상 클래스의 멤버에만 이 변경자를 붙일 수 있다. 추상 멤버에는 구현이 있으면 안 된다.
 * override - 상위 클래스나 상위 인스턴스의 멤버를 오버라이드 중 -> 오버라이드하는 멤버는 기본적으로 열려있음.
 *
 */

open class RichButton : Clickable {
    final override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimation() {

    }

    fun animateTwice() {

    }
}

/**
 * 가시성 변경자
 * 타입의 가시성은 그 클래스 자신의 가시성과 같거나 더 높아야 한다.
 * 코틀린은 자바와 달리 같은 패키지 안에서 protected 멤버에 접근할 수 있지만, 코틀린에서는 그렇지 않다.
 */
internal open class TalkativeButton : Focusable {
    //open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")

    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
    // fun TalkativeButton.giveSpeech() {
}


/**
 * 내부클래스의 중첩된 클래스
 * 코틀린의 중첩 클래스는 명시적으로 요청하지 않는 한 바깥쪽 클래스 인스턴스에 대한 접근 권한이 없다.
 *
 */

/**
 * sample 1
 */
interface State : Serializable

interface ViewState {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonView : ViewState {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}
    class ButtonState : State {}
}

/**
 * sample 2
 */

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

fun main() {
    println(Btn().click())
    val btn = Btn()
    btn.showOff()
    btn.setFocus(true)
    btn.click()
}

