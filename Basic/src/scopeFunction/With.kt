package scopeFunction


// non-null의 객체를 사용하고 블럭의 return 값이 필요하지 않을 때 사용
// 주로 객체의 함수를 여러 개 호출할 때 그룹화하는 용도로 활용
fun main() {
    // 일반 함수
    println(
        with(personWith) {
            name
            age
            this
        }
    )
}

val personWith = Person("with", 50)