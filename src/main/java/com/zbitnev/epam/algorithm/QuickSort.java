package com.zbitnev.epam.algorithm;

/**
 * The QuickSort algorithm;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class QuickSort {
    public int[] quickSort(int[] array, int low, int high) {
        int middle = low + (high - low) / 2;
        int base = array[middle];
        int i = low;
        int j = high;

        if (array.length == 0) {
            throw new ArrayStoreException();
        }
        if (low >= high) {
            throw new ArrayStoreException();
        }
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }
            while (array[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
        return array;
    }
}