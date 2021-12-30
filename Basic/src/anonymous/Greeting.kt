package anonymous

fun main() {

    println(greetingFunction())
    println(greetingFunction2("jay"))
    println(greetingFunction3("제이", 30))
    println("======================")
    runSimulation("jay", greetingFunction3)


    // 코틀린에서 더블콜론(::)은 리플렉션을 위해 사용한다.
    // 리플렉션이란 코드를 작성하는 시점에는 런타임상 컴파일된 바이트 코드에서
    // 내가 작성한 코드가 어디에 위치하는지 알 수 없기 때문에
    // 바이트 코드를 이용해 내가 참조하려는 값을 찾기위해 사용
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    numbers
        .filter(::isOdd)
        .forEach {
        println(it)
    }
}

// 익명 함수는 암시적으로 또는 자동으로 함수 정의의 마지막 코드 결과를 반환한다.
val greetingFunction: () -> String = {
    val currentYear = 2022
    "next year! $currentYear"
}
val greetingFunction2: (String) -> String = { playerName ->
    val currentYear = 2021
    "$playerName!, this year is $currentYear"
}

val greetingFunction3 = { playerName: String, numBuildings: Int ->
    val currentYear = 2021
    println("${numBuildings}개 추가~!")
    "playerName : ${playerName}님, 현재 $currentYear"
}

fun runSimulation(playerName: String, greetingFunction3: (String, Int) -> String) {
    val randomNums = (1..10).shuffled().last()
    println(greetingFunction3(playerName, randomNums))
}

fun isOdd(x: Int): Boolean {
    return x % 2 != 0
}




// https://carrido-hobbies-well-being.tistory.com/142