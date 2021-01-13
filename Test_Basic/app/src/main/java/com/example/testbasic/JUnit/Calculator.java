package com.example.testbasic.JUnit;

public class Calculator {
    Calculator() {
    }

    public int addValue(int a, int b) {
        return a + b;
    }

    public int[] addArray(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        return arr;
    }
}
