package sealed

// sealed class란 추상 클래스로 상속받는 자식 클래스의 종류를 제한하는 특성을 가지고 있다.
// 즉, 컴파일러에서 sealed class의 자식 클래스가 어떤 것이 있는지 알 수 있다.



sealed class PersonState

// sealed class는 자식클래스에 대한 선언을 같은 패키지내로 제한한다.
// 리소스 소모를 줄일 수 있는 일종의 방법

//class Running : PersonState()
//class Walking : PersonState()
//class Idle : PersonState()
//class Swimming : PersonState()

// object는 싱글톤 패턴으로 한번만 메모리에 올라가고 재사용됨.
object Running : PersonState()
object Walking : PersonState()
object Idle : PersonState()
object Swimming : PersonState()

fun getStateMessage(personState: PersonState): String {
    return when (personState) {
        is Running -> "Running"
        is Walking -> "Walking"
        is Idle -> "Idle"
        is Swimming -> "Swimming"
//        else -> "else"
    }
}



// 출처 : https://kotlinworld.com/165?category=924651