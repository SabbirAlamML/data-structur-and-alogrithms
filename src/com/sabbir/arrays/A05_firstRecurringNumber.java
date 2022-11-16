package com.sabbir.arrays;

import java.util.HashMap;

public class A05_firstRecurringNumber {

    public static int firstRecurringNumber(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return inputArray[i];
                }
            }
        }
        return 0;
    } //O(n^2)


    public static int firstRecurringNumberHashMap(int[] inputArray) {
        HashMap map = new HashMap();
        for (int i = 0; i < inputArray.length; i++) {
            if (map.containsKey(inputArray[i])) {
                return inputArray[i];
            } else {
                map.put(inputArray[i], inputArray[i]);
            }
        }
        return 0;
    } //O(n)

    public static void main(String[] args) {
        int[] inputArr = {2, 3, 1, 5, 1, 4, 5};
        System.out.println(firstRecurringNumberHashMap(inputArr));
    }
}
