package com.sabbir.sort;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from the unsorted part and putting it at the beginning.
 * <p>
 * The algorithm maintains two subarrays in a given array.
 * <p>
 * The subarray which already sorted.
 * The remaining subarray was unsorted.
 * In every iteration of the selection sort, the minimum element (considering ascending order)
 * from the unsorted subarray is picked and moved to the sorted subarray.
 */
public class A02_SelectionSort {

    //inputArray = {64, 25, 12, 22, 11}
    public static int[] selectionSort(int[] inputArray) {
        int length = inputArray.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    minIndex = j;
                    int tempVariable = inputArray[minIndex];
                    inputArray[minIndex] = inputArray[i];
                    inputArray[i] = tempVariable;
                }

            }
        }
        return inputArray;
    }

    //inputArray = {64, 25, 12, 22, 11}
    public static int[] selectionSort2(int[] inputArray) {
        int length = inputArray.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    int tempVariable = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = tempVariable;
                }

            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {64, 25, 12, 22, 11};
        int[] output = selectionSort2(inputArray);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }

}
