package com.sabbir.math;

public class PalindromNumber {

    public static boolean isPalindromNumber(int input) {
        int reverse = 0;
        int temp = input;
        while (temp != 0) {
            int id = temp % 10;
            reverse = reverse * 10 + id;
            temp = temp / 10;
        }
        return (input == reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromNumber(234321));
    }
}
