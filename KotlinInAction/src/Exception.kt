import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.util.logging.LogManager

val number = 7;
val reader = BufferedReader(StringReader("not a number"))

fun main() {
    val percentage =
        if (number in 0..100) number else throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    println(percentage)
    readNumber(reader)

}

/**
 * 코틀린에서는,  try ~ catch 예외처리는 식이다. (if문 역시도 식이다.)
 */

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}