package anonymous

fun main() {
    // 익명 함수는 암시적으로 또는 자동으로 함수 정의의 마지막 코드 결과를 반환한다.
    val greetingFunction: () -> String = {
        val currentYear = 2022
        "next year! $currentYear"
    }

    println(greetingFunction())

    val greetingFunction2: (String) -> String = {
        playerName ->
        val currentYear = 2021
        "$playerName!, this year is $currentYear"
    }

    println(greetingFunction2("jay"))
}

// https://carrido-hobbies-well-being.tistory.com/142