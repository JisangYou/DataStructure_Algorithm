package Chapter4

import java.io.File


/**
 * 4.4 object 키워드 : 클래스 선언과 인스턴스 생성
 * object 키워드를 다양한 상황에서 사용하지만 모든 경우 클래스를 정의 하면서 동시에 인스턴스를 생성한다는 공통점이 있다.
 */

/**
 * 1. 객체 선언은 싱글턴을 정의하는 방법 중 하나
 * 2. 동반 객체는 인스턴스 메소드는 아니지만 어떤 클래스와 관련있는 메소드와 팩토리 메소드를 담을 떄 쓰인다.
 * 3. 무명 내부 클래스 대신 쓰인다.
 */

// 1
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File?, o2: File?): Int {
        return o1!!.path.compareTo(o2!!.path, ignoreCase = true)
    }
}


/**
 * 클래스 안에 정의된 객체 중 하나에 companion이라는 특별한 표시를 붙이면 그 클래스와 동반 객체로 만들 수 있음.
 */


fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))

    Companion.bar()
}