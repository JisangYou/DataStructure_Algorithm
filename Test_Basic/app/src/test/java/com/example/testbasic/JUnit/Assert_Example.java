package com.example.testbasic.JUnit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class Assert_Example {


    /**
     * assertEquals(a, b) : 객체 A와 B가 같은 값을 가지는지 확인한다
     */
    @Test
    public void addtion_isCorrect() {
        assertEquals(4, 3 + 2);
    }

    /**
     * assertEquals(a, b, c) :  객체 A와 B가 값이 일치함을 확인한다.( a: 예상값, b:결과값, c: 오차범위)
     */
    @Test
    public void addtion2_isCorrect() {
        assertEquals(7 ,3 + 2, 2);
//        assertEquals(10, 3 + 2, 2);
    }


    /**
     * assertTrue(a): 조건 A가 참인지 확인한다.
     */
    @Test
    public void boolean_isCorrect() {
        boolean test = false;
        assertTrue(!test);
//        assertTrue(test);
    }

    /**
     * assertArrayEquals(a, b) :  배열 A와 B가 일치함을 확인한다.
     */
    @Test
    public void array_isCorrect() {
        int arr1[] = {1, 2, 3};
//        int arr2[] = {1, 2, 3};
        int arr2[] = {1, 2, 4};
        assertArrayEquals(arr1, arr2);
    }

    /**
     * assertNotNull(a) : 객체 A가 null이 아님을 확인한다.
     */
    @Test
    public void object_isCorrect() {
//        Calculator calculator = null;
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

}
