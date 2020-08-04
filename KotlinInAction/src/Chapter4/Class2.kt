package Chapter4

import java.lang.IllegalArgumentException
import javax.naming.Context
import javax.swing.text.AttributeSet
import kotlin.system.measureTimeMillis


/**
 * 클래스 초기화 : 주 생성자와 초기화 블록
 */

class UserSample constructor(_nickName: String) {
    val nickName: String

    init { // 초기화 블
        nickName = _nickName // 생성 파라미터 _nickName에서 맨 앞의 밑줄(_)은 프로퍼티와 생성자 파라미터를 구
    }
}

class UserSample2(val nickName: String, val isSubScribed: Boolean = true)

/**
 * 아래와 같이 open class로 만들어야 상속이 가능함.
 * 예
 */
open class UserSample3(val nickName: String, val isSubScribed: Boolean = true)

class TwitterUser(nickName: String) : UserSample3("hello") {
    /**/
}

/**
 * 부 생성자 : 상위 클래스를 다른 방식으로 초기화
 */

/**
 * 1
 */
open class ViewSample {
    constructor(ctx: Context) {

    }

    constructor(ctx: Context, attr: AttributeSet)
}

/**
 * 2
 */
class MyButtonSample : ViewSample {
    constructor(ctx: Context) : super(ctx) {

    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {

    }

}

/**
 * 3
 */


//class MyButton2 : Chapter4.ViewSample {
//constructor(ctx: Context) : this(ctx, MY_STYLE) {

//}

//constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {

//}

//}


/**
 * 4.2.3 인터페이스에 선언된 프로퍼티 구현
 */

interface UserSample4 {
    val nickName: String
}

open class PrivateUser(override val nickName: String) : UserSample4
class SubscribingUser(val email: String) : UserSample4 {
    override val nickName: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : UserSample4 {
    override val nickName = getFacebookName(accountId)

    private fun getFacebookName(accountId: Int): String {
        return accountId.toString()
    }
}

/**
 * 4.2.4 게터와 세터에서 뒷받침하는 필드에 접근
 * $field라는 특별한 식별자를 통해 뒷받침하는 필드에 접근할 수 있음.
 */
class UserSample5(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
            Address was changed for $name:
            "$field" -> "$value".""".trimIndent()
            )
            field = value
        }
}

/**
 * 4.2.5 접근자의 가시성 변경
 * 해당 클래스 내부에서만 길이를 변경하게 만들고 싶을때 아래 예시
 * private set
 */
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val jay = UserSample2("제이")
    println(jay.isSubScribed)
    val gye = UserSample2("계명", false)
    println(gye.isSubScribed)
    val hey = UserSample2("혜원", isSubScribed = false) // -> 생성자 인자 중 일부에 대해 이름을 지정할 수 있음.
    println(hey.isSubScribed)
    println(PrivateUser("test@kotlinlang.org").nickName)
    val user = UserSample5("Alice")
    user.address = "sinjeong"
    println(user.address)
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}