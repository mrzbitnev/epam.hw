package com.zbitnev.epam.algorithm;

/**
 * The BubbleSort simple algorithm sorting;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
