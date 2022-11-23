package com.sabbir;

public class FibonacciSeries {
    public static int findTotalNumberCase(int inputNum) {
        int totalCase = 0;
        int number1 = 0;
        int number2 = 1;
        int counter = 0;

        while (counter < inputNum) {
            totalCase = number1 + number2;
            number1 = number2;
            number2 = totalCase;
            counter = counter + 1;
        }
        return totalCase;
    }

    public static int fibonacciNumber(int size){
        int first = 0;
        int next = 1;
        int lastNumber = 0;
        for (int i = 0; i < size; i++) {
            lastNumber = first + next;
            first = next;
            next = lastNumber;
        }
        return lastNumber;
    }

    public static void main(String[] args) {
        System.out.println(findTotalNumberCase(6));
        System.out.println(fibonacciNumber(5));
    }
}
