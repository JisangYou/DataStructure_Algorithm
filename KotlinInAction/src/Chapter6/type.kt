package Chapter6

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

}

/**
 * 6.1.1 널이 될 수 있는 타입
 */

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0


/**
 * 6.1.3 안전한 호출 연산자: ?.
 */

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName():String{
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}