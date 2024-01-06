package com.example.fastcampusbasic


fun main() {
    val result = test(1, 5)
}

/**
 *  Kotlin의 default vaiue은 자바의 오버로딩
 *  트레일링 콤마 시 컴파일 에러 안남.
 */

fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a + b)
    return a + b
}

// single expression
fun test2(a: String, b: String = "jay", c: String = "jayyoo") = println(a + b + c)
