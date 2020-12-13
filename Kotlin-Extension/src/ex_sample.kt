open class Shape

class Rectangle: Shape()

fun Shape.getName() = "Shape"

fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

fun main() {

    printClassName(Rectangle())
    Example().printFunctionType()
    Example2().printFunctionType(1)
}


class Example {
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }



class Example2 {
    fun printFunctionType() { println("Class method") }
}

fun Example2.printFunctionType(i: Int) { println("Extension function $i") }


