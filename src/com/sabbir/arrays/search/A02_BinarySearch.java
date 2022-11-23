package com.sabbir.arrays.search;

public class A02_BinarySearch {

    public static int binarySearchWhile(int[] inputArray, int key) {
        int start = 0;
        int end = inputArray.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (inputArray[mid] == key) {
                return mid;
            }
            if (inputArray[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] inputArray, int start, int end, int key) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (inputArray[mid] == key) {
                return mid;
            }
            if (inputArray[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            return binarySearchRecursion(inputArray, start, end, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearchWhile(inputArray, 6));
        System.out.println(binarySearchWhile(inputArray, 3));
        System.out.println(binarySearchWhile(inputArray, 9));

        System.out.println(binarySearchRecursion(inputArray, 0, 6, 6));
        System.out.println(binarySearchRecursion(inputArray, 0,6,3));
        System.out.println(binarySearchRecursion(inputArray, 0, 6,9));

    }
}
