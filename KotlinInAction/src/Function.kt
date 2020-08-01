import java.awt.Button
import java.lang.StringBuilder


/**
 * 코틀린 컬렉션 프레임워크 만드는 방법
 */

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")


fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
//    println(joinToString(list,",",",",","))
    println(joinToString(list))
    println("Kotlin".lastChar)
    println("Kotlin".lastChar())
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}

/**
 * 어떤 타입의 값을 원소로 하는 컬렉션이든 처리할 수 있는 제네릭한 함수.
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 확장 함수 및 프로퍼티
 */
fun String.lastChar(): Char = this.get(this.length - 1)

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

/**
 * 확장 함수는 오버라이드 할 수 없다.
 */
open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = kotlin.io.println("i am a view!")
fun Button.showOff() = println("I'm a button!")













