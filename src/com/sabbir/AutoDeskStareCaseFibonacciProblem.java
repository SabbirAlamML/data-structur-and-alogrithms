package com.sabbir;

public class AutoDeskStareCaseFibonacciProblem {
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

    public static void main(String[] args) {
        System.out.println(findTotalNumberCase(6));
    }
}
