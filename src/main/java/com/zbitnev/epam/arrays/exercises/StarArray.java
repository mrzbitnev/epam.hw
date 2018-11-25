package com.zbitnev.epam.arrays.exercises;

/**
 * The StarArray get symbol from array in chess order twice, from left to right and from top to bottom.
 *
 * @version 1.0
 * @exercise 12.272;
 * @autor Ivan Zbitnev
 */
public class StarArray {
    public String getLetter(char[][] array) {
        StringBuilder letterRow = new StringBuilder();
        StringBuilder letterColumn = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    letterRow.appendCodePoint(array[i][j]);
                    letterColumn.append(array[j][i]);
                }
            }
        }
        return String.valueOf("first quastion (row) is: " + letterRow + " and second (column) " + letterColumn);
    }
}
