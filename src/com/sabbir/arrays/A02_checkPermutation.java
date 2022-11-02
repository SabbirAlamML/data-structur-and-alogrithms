package com.sabbir.arrays;

import java.util.Arrays;

/**
 * check if 2 string are have same permutation, example: sikkim, kimsik or god, dog
 */
public class A02_checkPermutation {
    public static void main(String[] args) {
        System.out.println(permutation("sikkim", "kimsik"));
    }

    public static boolean permutation(String str1, String str2) {
        //trim string to remove unwanted space
        str1 = str1.trim();
        str2 = str2.trim();
        if (str1.length() != str2.length()) {
            return false;
        }
        //check if both string are equal
        return returnSortedStringChar(str1).equals(returnSortedStringChar(str2));
    }

    /**
     * this method will convert string to char array then sort it and then convert into sorted string.
     *
     * @param inputString
     * @return sorted string
     */
    private static String returnSortedStringChar(String inputString) {
        char[] chars = inputString.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

}
