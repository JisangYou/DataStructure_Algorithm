enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 255 + b
}

// 자바에서 switch같은 개념
// break을 따로 넣지 않는다.

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }


fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}


fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) { // when 식의 인자로 아무 객체나 사용할 수 있다. when은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트한다.
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }


fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
    print(mix(Color.BLUE, Color.YELLOW))
}


