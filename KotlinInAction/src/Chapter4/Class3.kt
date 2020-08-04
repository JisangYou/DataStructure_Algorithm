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

/**
 * 4.3.2 데이터 클래스: 모든 클래스가 정의해야 하는 메소드 자동 생성
 * 어떤 클래스가 데이터를 저장하는 역할만을 수행한다면 toString, equals, hashCode를 반드시 오버라이드해야하는데
 * 코틀린에서는 data class를 사용하면 된다.
 * 프로퍼티 선언 간에, 읽기 전용의 이유 val로 선언하는 것을 권장한다.
 *
 */

data class Client4(val name: String, val postalCode: Int)

/**
 * 4.3.3 클래스 위임 : by 키워드 사용
 * 코틀린은 클래스 구조는 기본적으로 final이고, 필요에 따라 open으로 열어 확장을 할 수 있다.
 * 종종 상속을 허용하지 않는 클래스에 새로운 동작을 추가해야 할 떄가 있고, 이때 데코레이터 패턴을 사용한다.
 */

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}


fun main() {
    val client1 = Client("오현석", 4122)
    println(client1)
    val client2 = Client2("오현석", 4122)
    println(client2)
    val client3 = Client3("오현석", 4122)
    println(client3)
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
