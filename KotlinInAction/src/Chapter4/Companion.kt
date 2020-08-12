package Chapter4

/**
 * 클래스 안에 정의된 객체 중 하나에 companion이라는 특별한 표시를 붙이면 그 클래스와 동반 객체로 만들 수 있음.
 */
class Companion {
    companion object{
        fun bar(){
            println("Companion object called")
        }
    }
}