package Chapter4

/**
 * 부 생성자가 여럿 있는 클래스 정의하기
 */
class User {
    private val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}