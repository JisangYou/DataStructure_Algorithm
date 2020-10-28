package Chapter6

import java.io.BufferedReader
import java.lang.NumberFormatException

/**
 * 6.3 컬렉션과 배열
 */

fun main() {

}

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}