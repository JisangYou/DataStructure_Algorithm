package com.example.testbasic.jUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Annotation_example {


    @Test
    public void addtion_isCorrect() {
        /**
         * 객체 A와 B가 같은 값을 가지는가?
         */
        // 맞는 경우
         assertEquals(4, 2 + 2);
        // 틀린 경우
        // assertEquals(4, 3 + 2);
    }
}
