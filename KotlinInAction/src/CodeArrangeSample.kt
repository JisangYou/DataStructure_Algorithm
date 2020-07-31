import java.lang.IllegalArgumentException

fun main() {


//    println(duplicatedSaveUser(User(1, "", "")))
//    println(refactoringSaveUser1(User(1, "", "")))
    println(saveUser(User(1, "", "")))


}

class User(val id: Int, val name: String, val address: String)

fun duplicatedSaveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Address")
    }
}

fun refactoringSaveUser1(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName"
            )
        }
        validate(user, user.name, "Name")
        validate(user, user.address, "Address")
    }
}

fun refactoringSaveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName"
            )
        }
        validate(user.name, "Name")
        validate(user.address, "Address")
    }
}


fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
}


