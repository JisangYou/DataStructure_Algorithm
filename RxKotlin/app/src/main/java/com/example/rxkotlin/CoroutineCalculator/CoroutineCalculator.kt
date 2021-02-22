package com.example.rxkotlin.CoroutineCalculator

class CoroutineCalculator(a: Int, b: Int) {

    val subjectCalc:
            io.reactivex.subjects.Subject<CoroutineCalculator> =
        io.reactivex.subjects.PublishSubject.create()
    var nums: Pair<Int, Int> = Pair(0, 0)

    init {
        nums = Pair(a, b)
        subjectCalc.subscribe {
            with(it) {
                calculateAddition()
                calculateSubstraction()
                calculateMultiplication()
                calculateDivision()
            }
        }
        subjectCalc.onNext(this)
    }

    private fun calculateAddition(): Int {
        val result = nums.first + nums.second
        println("Add = $result")
        return result
    }

    private fun calculateSubstraction(): Int {
        val result = nums.first - nums.second
        println("Substraction = $result")
        return result
    }

    private fun calculateMultiplication(): Int {
        val result = nums.first + nums.second
        println("Multyply = $result")
        return result
    }

    private fun calculateDivision(): Double {
        val result = (nums.first * 1.0) / (nums.second * 1.0)
        println("Division = $result")
        return result
    }

    fun modifyNumbers(a: Int = nums.first, b: Int = nums.second) {
        nums = Pair(a, b)
        subjectCalc.onNext(this)
    }

    suspend fun handleInput(inputLine: String?) { // 1
        if (!inputLine.equals("exit")) {
            val pattern: java.util.regex.Pattern = java.util.regex.Pattern.compile("([a|b])(?:\\s)?=(?:\\s)?(\\d)");

            var a: Int? = null
            var b: Int? = null

            val matcher: java.util.regex.Matcher = pattern.matcher(inputLine)

            if (matcher.matches() && matcher.group(1) != null && matcher.group(2) != null) {
                if (matcher.group(1).toLowerCase().equals("a")) {
                    a = matcher.group(2).toInt()
                } else if (matcher.group(1).toLowerCase().equals("b")) {
                    b = matcher.group(2).toInt()
                }
            }

            when {
                a != null && b != null -> modifyNumbers(a, b)
                a != null -> modifyNumbers(a = a)
                b != null -> modifyNumbers(b = b)
                else -> println("Invalid Input")
            }
        }
    }

}