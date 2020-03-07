import java.util.*

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c in '0'..'9'
fun iteratorDownTo() {
    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}

val binaryReps = TreeMap<Char, String>()

fun mapIteration() {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun main() {
//    println(isLetter('q'))
//    iteratorDownTo()
    mapIteration()
}