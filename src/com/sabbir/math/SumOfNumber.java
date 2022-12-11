package com.sabbir.math;

public class SumOfNumber {
    public static int sumOfNumber(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static int sumOfNumber1(int input) {
        return input * (input + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumber(4));
        System.out.println(sumOfNumber1(4));
    }

}
