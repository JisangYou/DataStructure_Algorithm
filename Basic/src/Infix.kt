fun main() {
    val string = "Hello" add "World"
    val int = 1 plus 2
    println(string)
    println(int)
}

infix fun String.add(x: String): String {
    return "$this $x"
}

infix fun Int.plus(x: Int): Int {
    return this + x
}

