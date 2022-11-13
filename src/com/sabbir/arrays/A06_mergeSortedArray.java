package com.sabbir.arrays;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/merge-two-sorted-arrays/
 * <p>
 * Given two sorted arrays, the task is to merge them in a sorted manner.
 * Examples:
 * Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
 * Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
 * <p>
 * Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
 * Output: arr3[] = {4, 5, 7, 8, 8, 9}
 * <p>
 * <p>
 * Same type another complex problem.
 * https://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
 * <p>
 * We are given two sorted arrays. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array. Extra space is allowed in O(1).
 * <p>
 * Example:
 * <p>
 * Input: ar1[] = {10};
 * ar2[] = {2, 3};
 * Output: ar1[] = {2}
 * ar2[] = {3, 10}
 * <p>
 * Input: ar1[] = {1, 5, 9, 10, 15, 20};
 * ar2[] = {2, 3, 8, 13};
 * Output: ar1[] = {1, 2, 3, 5, 8, 9}
 * ar2[] = {10, 13, 15, 20}
 */
public class A06_mergeSortedArray {

    /**
     * Option 1 : Brute force
     * <p>
     * It is the brute force method to do the same.
     * Take all the elements of arr1 and arr2 in arr3. Then simply sort the arr3.
     * <p>
     * Time: O(m+n)
     * Space: O(1)
     *
     * @return
     */
    public static int[] mergeTwoSortedArray1(int[] arr1, int[] arr2) {
        int[] mergeSortedArray = new int[arr1.length + arr2.length];
        int k = 0;
        // O(m)
        for (int j : arr1) {
            mergeSortedArray[k] = j;
            k++;

        }
        //O(n)
        for (int i = 0; i < arr2.length; i++) {
            mergeSortedArray[k] = arr2[i];
            k++;
        }
        Arrays.sort(mergeSortedArray);
        return mergeSortedArray;
    }


    /**
     * option 2
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] mergeTwoSortedArray2(int[] arr1, int[] arr2) {
        int[] sortedArray = new int[arr1.length + arr2.length];
        int longArrLength = arr1.length;
        if (arr2.length > arr1.length) {
            longArrLength = arr2.length;
        }
        for (int i = 0; i < longArrLength; i++) {
            if (arr1[i] > arr2[i]) {
                arr1[i] = arr2[i];
            }
        }
        return sortedArray;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr = mergeTwoSortedArray1(arr1, arr2);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
