package com.sabbir.sort;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in the wrong order. This algorithm is not suitable for large data sets as its average and
 * worst-case time complexity is quite high.
 */
public class A03_BubbleSort {
    //inputArray = {64, 25, 12, 22, 11}
    public static int[] bubbleSort(int[] inputArray) {
        int length = inputArray.length;
        boolean sorted = false;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (inputArray[j + 1] < inputArray[j]) {
                    int temp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temp;
                    sorted = true;
                }
                if (sorted == false) {
                    break;
                }
            }

        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {64, 25, 12, 22, 11};
        int[] arr = {5, 1, 4, 2, 8};
        int[] output = bubbleSort(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}
