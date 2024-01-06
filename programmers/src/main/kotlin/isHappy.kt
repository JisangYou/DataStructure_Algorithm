fun isHappy(n: Int): Boolean {
    var result = n
    var temp: Int
    while (result.toString().count() > 1) {
        temp = 0
        result.toString().map { it ->
            temp += it.toString().toInt() * it.toString().toInt()
            result = temp // result 값을 temp로 갱신해야 합니다.
            println("temp: $temp")
        }
    }
    return result == 1
}