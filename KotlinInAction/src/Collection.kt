val strings: List<String> = listOf("first", "second", "fourteenth")
val numbers: Collection<Int> = setOf(1, 14, 2)


fun main(args: Array<String>) {


    println(strings.last())
    println(numbers.max())
    val list = listOf("args: ", *args)
    println(list)

    map()
    pair()
    regex()

}

/**
 * to 함수를 사용하면 타입과 관계없이 임의의 순서쌍을 만들 수 있다.
 */

fun map() {
    /**
     * to 함수의 정의를 갈략히 줄인 코드
     *
     * infix fun Any.to(other: Any) = Pair(this, other)
     *
     */
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)
}

fun pair() {
    /**
     * 구조 분해 선언 (destructuring declaration)
     *
     */
    val (number, name) = 1 to "one"
    println("number = $number")
    println("name = $name")

//    for((index, element) in collection.withIndex()){
//        println()
//    }
}

fun regex() {
    println("12.345-6.A".split("\\.|-".toRegex()))
}