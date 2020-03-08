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