package Chapter4


/**
 * 4.3.1 모든 클래스가 정의해야 하는 메소드
 */

/**
 * toString()
 */
class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client (name=$name, postalCode=$postalCode)"
}

/**
 * equals()
 * 코틀린에서 ==를 통해 안전하게 그 클래스의 인스턴스를 비교
 * 참조비교는 === 연산자 사용가
 * 코틀린 is = 자바 instanceof
 */

class Client2(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client2)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString() = "Client2 (name=$name, postalCode=$postalCode)"
}


class Client3(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client2)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString() = "Client3 (name=$name, postalCode=$postalCode)"
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val client1 = Client("오현석", 4122)
    println(client1)
    val client2 = Client2("오현석", 4122)
    println(client2)
    val client3 = Client3("오현석", 4122)
    println(client3)
}
