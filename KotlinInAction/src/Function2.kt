fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}



fun main() {

    parsePath("C:/Users/USER/workspace/Kotlin-Sample-Project/KotlinInAction/KotlinInAction.iml")
}