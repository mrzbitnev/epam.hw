package com.zbitnev.epam.algorithm;

/**
 * The BinarySearch simple algorithm of searching;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
