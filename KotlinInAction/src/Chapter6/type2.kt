package Chapter6

/**
 * 6.1.8 나중에 초기화할 프로퍼티
 */

/**
 * 6.10 널 아님 단언을 사용해 널이 될 수 있는 프로퍼티 접근하기
 */

fun main() {

    verifyUserInput(" ")
    verifyUserInput(null)

    println(Person4("Sam", 35).isOlderThan(Person4("Amy", 42)))

    val x = 1
    val list = listOf(1L, 2L, 3L)
    println(x.toLong() in list)

    println("42".toInt())

}

class MyService {
    fun performAction(): String = "foo"
}

/**
 * 6.1.9 널이 될 수 있는 타입 확장
 */

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}
