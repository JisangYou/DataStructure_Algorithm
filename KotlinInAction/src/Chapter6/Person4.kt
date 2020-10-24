package Chapter6

data class Person4(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person4): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}