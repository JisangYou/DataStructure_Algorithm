package Chapter5


/**
 * 5.2 함수형 api
 */

fun main() {

    /**
     * 5.2.1 필수적인 함수 filter, map
     */

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person3("Alice", 29), Person3("Bob", 31), Person3("Jisang", 26))
    println(people.filter { it.age > 30 })

    val list2 = listOf(1, 2, 3, 4)
    println(list2.map { it * it })

    println(people.filter { it.age > 30 }.map(Person3::name))

    /**
     * 5.2.2 all, any, count, find: 컬렉션에 술어 적용
     */

    val canBeInClub27 = { p: Person3 -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    val list3 = listOf(1, 2, 3)
    println(!list3.all { it == 3 })
    println(list3.any { it != 3 })
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))


    /**
     * 5.2.3 group by
     */
    val list4 = listOf("a", "ab", "b")
    println(list4.groupBy(String::first))

    /**
     * 5.2.4 flatMap과 flatten : 중첩된 컬렉션 안의 원소 처리
     */
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}


