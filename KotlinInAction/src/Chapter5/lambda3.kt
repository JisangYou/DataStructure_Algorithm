package Chapter5

import java.io.File

/**
 * 5.3.1 시퀀스 연산 실행: 중간 연산과 최종 연산
 */
fun main() {
    sample1()
    sample2()
    sample3()
    println(file.isInsideHiddenDirectory())
}

fun sample1() {
    println(" == sammple1 == 출력 안됨")
    listOf(1, 2, 3, 4).asSequence().map { println("map($it "); it * it }.filter { println("filter($it) "); it * 2 == 0 }
}

fun sample2() {
    println(" == sammple2 == 출력 됨")
    listOf(1, 2, 3, 4).asSequence().map { println("map($it) "); it * it }
        .filter { println("filter($it) "); it * 2 == 0 }
        .toList()
}

fun sample3() {
    println(" == sammple3 == 출력 됨")
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
val file = File("/Users/svtk/.HiddenDir/a.txt")

