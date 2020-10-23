package Chapter6

/**
 * 6.1.8 나중에 초기화할 프로퍼티
 */

/**
 * 6.10 널 아님 단언을 사용해 널이 될 수 있는 프로퍼티 접근하기
 */

class MyService{
    fun performAction(): String = "foo"
}

class MyTest{
    private var myService: MyService? = null
    @Before fun setUp{
        myService = MyService()
    }
    @Test fun testAction{
        Assert.assertEquals("foo",myService!!.performAction())
    }
}

annotation class Before
