package com.example.fastcampusbasic


/**
 * 생성자와 프로퍼티를 한꺼번에 세팅가능
 * default value 지원
 * 생성자는 init 블럭에서, 부생성자에서 가능
 * 호출순서는 init -> 부생성자
 */
fun main() {
    val user = User("jay", 20)
    println(user.a)
    Kid("1",2,"3")
}

class User(val a: String, var b: Int = 100)
open class User2(open val a: String, open var b: Int = 100)


/**
 * 주생성자
 */
class Kid(override var a: String, override var b: Int) : User2(a, b) {
    var c: String = ""


    init {
        println("초기화 중")
    }

    /**
     * 부셍성자
     * secondary constructor
     * 중복 오버라이딩 x
     */

    constructor(a: String, b: Int, c: String) : this(a, b) {
        this.c = c
        println("부생성자 호출")
    }
}