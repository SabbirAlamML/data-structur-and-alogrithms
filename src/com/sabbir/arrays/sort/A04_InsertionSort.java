package com.sabbir.arrays.sort;

/**
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and
 * placed at the correct position in the sorted part.
 *
 * Characteristics of Insertion Sort:
 * This algorithm is one of the simplest algorithm with simple implementation
 * Basically, Insertion sort is efficient for small data values
 * Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
 */
public class A04_InsertionSort {


    //inputArray = {64, 25, 12, 22, 11}

    /**
     * Insertion Sort Algorithm
     * To sort an array of size N in ascending order:
     *
     * Iterate from arr[1] to arr[N] over the array.
     * Compare the current element (key) to its predecessor.
     * If the key element is smaller than its predecessor, compare it to the elements before.
     * Move the greater elements one position up to make space for the swapped element.
     * @param arr
     * @return arr
     */
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < arr[j]) {
                    //shift array
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            //Assign the value to index
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] output = insertionSort(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
