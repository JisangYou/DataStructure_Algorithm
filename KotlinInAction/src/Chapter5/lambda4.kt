package Chapter5

import java.lang.StringBuilder


/**
 * 5.4 자바 함수형 인터페이스 활용
 * SAM은 단일 추상 메소드 (SAM)
 */

fun main() {


    println("alphabet : " + alphabetWith())
    println("alphabet2 : " + alphabetWith2())
    println("alphabet3 : " + alphabetWith3())
    println("alphabet4 : " + alphabetApply())
    println("alphabet5 : " + alphabetApply2())

}


/**
 * 5.5 수신 객체 지정 람다: with와 apply
 */


/**
 * 5.5.1 with 함수
 */

fun alphabetWith(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(
            letter
        )
    }
    result.append("\nNow I Know the alphabet!")
    return result.toString()
}

fun alphabetWith2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabetWith3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

/**
 * 5.5.2 apply 함수
 */

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()


fun alphabetApply2() = buildString {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}