package Chapter5

import java.io.File.separator

fun main() {

    val people = listOf(Person3("jay", 32), Person3("alice", 29))
    println(findTheOldest(people))
    /**
     * 5.4 람다를 사용해 컬렉션 검색
     */
    println(people.maxBy { it.age })
    /**
     * 5.5 멤버참조를 사용해 컬렉션 검색
     */
    println(Person3::age)
    /**
     * 5.6 이름 붙인 인자를 사용해 람다 넘기기
     */
    val people2 = listOf(Person3("이몽룡", 32), Person3("성춘향", 29), Person3("방자", 25))
    val names = people2.joinToString(separator = " ", transform = { p: Person3 -> p.name })
    println(names)

    /**
     * 5.7 람다를 괄호 밖에 전달하기
     */
    println(people2.joinToString(" ") { p: Person3 -> p.name })

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    println(printProblemCounts(responses))
}

/**
 *  5.3 컬렉션을 직접 검색하기
 */
fun findTheOldest(people: List<Person3>) {
    var maxAge = 0
    var theOldest: Person3? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

/**
 * 5.10 함수 파라미터를 람다 안에서 사용하기
 */
fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

/**
 * 5.11 람다 안에서 바깥 함수의 로컬 변수 변경하기
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}
