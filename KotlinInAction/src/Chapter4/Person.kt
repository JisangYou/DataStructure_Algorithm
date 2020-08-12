package Chapter4

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person?, o2: Person?): Int {
            return o1!!.name.compareTo(o2!!.name)
        }
    }
}