package `interface`

data class Employee(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person