package com.example.testbasic.JUnit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalculateUnitTest {
    private Calculator calculator;

    /**
     * Test 메서드 실행 전 객체 생성!
     */
    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void addValue_test() {
//        assertEquals(52, calculator.addValue(2, 3));
        assertEquals(23, calculator.addValue(20, 3));
    }

    @Test
    public void addArray_test() {
        int[] arr = {1, 2, 3, 4};
        int[] ret = {4, 5, 6, 7};
        // 맞는 경우,
        assertArrayEquals(ret, calculator.addArray(arr, 3));
        // 틀린 경우
//        assertArrayEquals(ret, calculator.addArray(arr, 4));
    }
}
