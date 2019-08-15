interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr


/**
 * 자바 스타일
 */

fun eval_jv(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval_jv(e.right) + eval_jv(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

/**
 * 코틀린 스타일
 */

fun eval_kt1(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval_kt1(e.right) + eval_kt1(e.left)
        else ->
            throw java.lang.IllegalArgumentException("Unknown expression")
    }

fun eval_kt2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval_kt2(e.right) + eval_kt2(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(eval_jv(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval_kt1(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval_kt2(Sum(Sum(Num(1), Num(2)), Num(4))))

}
