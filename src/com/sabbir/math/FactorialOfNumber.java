package com.sabbir.math;

/**
 * Input: 5
 * Output: 5*4*3*2*1 = 120
 * time complex: O(n)
 */
public class FactorialOfNumber {
    public static int factorialOfNumber(int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int recurssiveFactorial(int input) {
        if (input == 0) {
            return 1;
        }
        return input * recurssiveFactorial(input - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println(recurssiveFactorial(5));
    }
}
