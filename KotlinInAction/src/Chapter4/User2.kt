package Chapter4


/**
 * 부 생성자를 팩토리 메소드로 대신하기
 */
class User2 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User2(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User2(getFacebookName(accountId))
    }
}

fun getFacebookName(facebookAccountId: Int): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}