

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, ${name}!")

    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}

/* 자바

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
*/

/* 코틀린 */

class Person(val name: String, val isMarried: Boolean)