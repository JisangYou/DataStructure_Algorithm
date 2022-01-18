package scopeFunction

// 확장함수이기 때문에 safe call(.?)을 붙여 non-null 일 때에만 실행
// 어떤 값을 계산할 필요가 있거나 여러 개의 지역변수 범위를 제한할 때 사용
fun main() {
    println("$plusAge")
}

val person = Person("run", 1)
val plusAge = person.run { age?.plus(1) }