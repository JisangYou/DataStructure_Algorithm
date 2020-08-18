package Chapter4

/**
 * 4.4.3 동반 객체를 일반 객체처럼 사용
 */
class Person2(val name: String) {

    companion object Loader {
        fun fromJSON(jsonText: String): Person2 =
            Person2(jsonText)
    }
}