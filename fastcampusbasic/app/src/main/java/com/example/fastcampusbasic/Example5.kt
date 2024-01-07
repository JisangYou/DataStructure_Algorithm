package com.example.fastcampusbasic


fun main() {
    max(3, 10)
}


// 삼항 연산자는 없음.
fun max(a: Int, b: Int) {
    val result = if (a > b) a else b

    println(result)
}

fun isHoliday(dayOfWeek: Any) {
    val result = when (val day = dayOfWeek) {
        "토", "일" -> true
        "월" -> if (day == "월") "" else ""
        in 2..4 -> ""
        in listOf("월, 화") -> ""
        else -> false
    }
}