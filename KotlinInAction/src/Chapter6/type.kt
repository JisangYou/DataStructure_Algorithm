package Chapter6

import java.lang.IllegalArgumentException
import javax.swing.AbstractAction
import javax.swing.JList

fun main() {

    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())


    println("엘비스 연산자")
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))

    println("throw와 엘비스 연산자 함께 사용")
    printShippingLabel(Person("jay", Company("JetBrains", Address("seoul", 123, "yangcheon", "korea"))))
//    printShippingLabel(Person("jay", null))

    println("안전한 연산자를 사용해 equals 구현하기")

    val p1 = Person2("dmitry", "b")
    val p2 = Person2("dmitry", "b")

    println(p1 == p2)
    println(p1.equals(42))

    println(ignoreNulls(null))

}

/**
 * 6.1.1 널이 될 수 있는 타입
 */

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0


/**
 * 6.1.3 안전한 호출 연산자: ?.
 *
 */

/**
 *  6.2 널이 될 수 있는 프로퍼티를 다루기 위해 안전한 호출 사용하기
 */

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

/**
 * 6.1.4 엘비스 연산자: ?:
 */

/**
 * 6.4 엘비스 연산자를 활용해 널 값 다루기
 */

fun strLenSafe2(s: String?): Int = s?.length ?: 0 // "s"가 null이면 결과는 0 이다.

/**
 * 6.5 throw와 엘비스 연산자 함께 사용하기
 */

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

/**
 * 6.1.5 안전한 캐스트 as?
 */

class Person2(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person2 ?: return false

        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()

}


/**
 * 6.7 널 아님 단언 사용하기
 */

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!! // <-- 예외가 이 지점을 가리킨다.
    println(sNotNull.length) // <-- 이곳이 아니다.
    // 즉, 나는 이 값이 null이 아님을 잘 알 고 있다. 내가 잘 못 생각했다면 예외가 발생해도 감수하겠다라는 의미
}
















