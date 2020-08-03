import java.lang.IllegalArgumentException
import javax.naming.Context
import javax.swing.text.AttributeSet


/**
 * 인터페이스를 구현을 통해 식 표현하기.
 */

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

/**
 *  sealed 클래스로 식 표현하기
 */
sealed class Expr2 {
    class Num(val value: Int) : Expr2()
    class Sum(val left: Expr2, val right: Expr2) : Expr2()
}

fun eval2(e: Expr2): Int =
    when (e) {
        is Expr2.Num -> e.value
        is Expr2.Sum -> eval2(e.right) + eval2(e.left)
    }

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
 * 예시
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


//class MyButton2 : ViewSample {
    //constructor(ctx: Context) : this(ctx, MY_STYLE) {

//}

//constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {

//}

//}

fun main() {
    println(eval(Sum(Num(1), Num(3))))
    println(eval2(Expr2.Sum(Expr2.Num(1), Expr2.Num(3))))
    val jay = UserSample2("제이")
    println(jay.isSubScribed)
    val gye = UserSample2("계명", false)
    println(gye.isSubScribed)
    val hey = UserSample2("혜원", isSubScribed = false) // -> 생성자 인자 중 일부에 대해 이름을 지정할 수 있음.
    println(hey.isSubScribed)
}