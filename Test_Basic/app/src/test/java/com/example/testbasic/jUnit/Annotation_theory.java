package com.example.testbasic.jUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation_theory {

    /**
     *
     * jUnit에 사용되는 annotation이 무엇을 의미할까요?
     *
     */


    /**
     * 1. 테스트 메소드 지정
     *
     * @Test가 메소드위에 선언되면 이 메소드는 테스트 대상 메소드임을 의미
     */
    @Test
    public void testSum() {

    }

    /**
     * 2. 테스트 메소드 수행시간 제한하기
     * 이 테스트 메소드가 결과를 반환하는데 5,000밀리 초를 넘긴다면 이 테스트는 실패
     */
    @Test(timeout = 5000)
    public void testSum2() {

    }

    /**
     * 3. 테스트 메소드 Exception
     * RuntimeException이 발생해야 테스트가 성공, 그렇지 않으면 실패
     */
    @Test(expected = RuntimeException.class)
    public void testSum3() {

    }

    /**
     * 4. 초기화 및 해제
     *
     * @BeforeClass, @AfterClass가 메소드 위에 선언되면
     * <p>
     * 해당 테스트 클래스에서 딱 한 번씩만 수행되도록 지정하는 어노테이션
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    /**
     * @Before, @After가 메소드 위에 선언되면 해당 테스트 클래스 안에 메소드들이 테스트 되기
     *
     * 전과 후에 각각 실행되게 지정하는 어노테이션 입니다.
     *
     */

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


}
