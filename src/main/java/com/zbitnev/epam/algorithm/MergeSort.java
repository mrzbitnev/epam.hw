package com.zbitnev.epam.algorithm;

/**
 * The MergeSort simple algorithm sorting;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class MergeSort {
    public int[] mergeSort(int[] arr, int length) {
        if (length < 2) {
            return arr;
        }
        int mid = length / 2;
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            arrLeft[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            arrRight[i - mid] = arr[i];
        }
        mergeSort(arrLeft, mid);
        mergeSort(arrRight, length - mid);

        return merge(arr, arrLeft, arrRight, mid, length - mid);
    }

    public int[] merge(int[] arr, int[] arrLeft, int[] arrRight, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (arrLeft[i] < arrRight[j]) {
                arr[k++] = arrLeft[i++];
            } else {
                arr[k++] = arrRight[j++];
            }
        }
        while (i < left) {
            arr[k++] = arrLeft[i++];
        }
        while (j < right) {
            arr[k++] = arrRight[j++];
        }
        return arr;
    }
}
