package Chapter7

// 프로퍼티 접근자 로직 재활: 위임 프로퍼티
// 지연 초기화 - 객체의 일부분을 초기화하지 않고 남겨뒀다가 실제로 그 부분의 값이 필요한 경우 초기화할 때 흔히 쓰이는 패턴
// 아래는 backing property라는 기법인데, 복잡하고 성가심..
class Person(val name: String) {
    private var _emails: List<Email>? = null
    // as-is, _email은 null이 될 수 있고, email은 null일 될 수 없다.
//    val emails: List<Email>
//        get() {
//            if(_emails == null){
//                _emails = loadEmails(this)
//            }
//            return _emails!!
//        }
    // to-be
    val emails by lazy { loadEmails(this) }

    private fun loadEmails(person: Person): List<Email>? {
        println("${person.name}의 이메일을 가져옴")
        return listOf()
    }
}

class Email {

}