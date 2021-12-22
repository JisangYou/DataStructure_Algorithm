package `object`


fun main() {
    if (SingletonClass.sampleString == SingletonClass.sampleString) {
        println("동등성 비교 true")
    }
    if (SingletonClass.sampleString === SingletonClass.sampleString) {
        println("동일성 비교 true")
    }
}

object SingletonClass {
    val sampleString = "Sample String"
    val sampleString2 by lazy { "Sample String" }
    // object 자체가 프로세스 실행 시 메모리에 곧바로 올라가는 것은 막지 못하지만,
    // 내부 변수들을 by lazy를 이용해 생성함으로써 '호출'될 때 초기화 될 수 있게 만들 수 있다.
}

// jave 코드는 호출 될 때, 인스턴스가 생성되는 반면
// 코틀린에서는 프로세스가 시작될 때 인스턴스가 시작할때 인스턴스가 생성된다.

