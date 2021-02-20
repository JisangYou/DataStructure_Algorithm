package Chapter7

import java.lang.IndexOutOfBoundsException
import java.math.BigDecimal
import java.time.LocalDate


fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
//    println(p1 + p2)
//    println('a' * 3)
//    println(-Point(10, 20))
//    println(-BigDecimal.ZERO)
//    println(Point(10, 20) == Point(10, 20))
//    println(Point(10, 20) != Point(5, 5))
//    println(null == Point(5, 5))

}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

// 단항 연산자 오버로딩
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

// 증가 연산자 정의하기
operator fun BigDecimal.inc() = this + BigDecimal.ONE




