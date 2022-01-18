package scopeFunction

fun main() {
    println(let1)
//    println(let2)
//    println(let3)

}

val person = Person()
val let1 = person.let {
    it.name = "let1"
    it.age = 10
    // it, it.name, it.age, or nothing
}

//val let2 = person.let {
//    it.name = "let2"
//    it.age = 20
//    "{${it.name} is ${it.age}}" // (T)->R 부분에서의 R에 해당하는 반환값.
//}

//val let3 = person.let {
//    it.name = "let3"
//     (T)->R 부분에서의 R에 해당하는 반환값 없음
//}