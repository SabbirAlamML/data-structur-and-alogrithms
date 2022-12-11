package com.sabbir.math;

public class TrailingZeroInFactorial {
    public static int trailingZeroInFactorial(int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        int count = 0;
        while (factorial % 10 == 0) {
            count++;
            factorial = factorial / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroInFactorial(10));
    }
}
