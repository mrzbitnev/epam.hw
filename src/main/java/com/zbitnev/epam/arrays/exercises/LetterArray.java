package com.zbitnev.epam.arrays.exercises;

/**
 * The LetterArray get symbol from array even from row and odd from column.
 *
 * @version 1.0
 * @exercise 12.273, 12.274;
 * @autor Ivan Zbitnev
 */
public class LetterArray {
    public String getEvenFromRow(char[][] array) {
        StringBuilder evenLetterRow = new StringBuilder();
        StringBuilder oddLetterColumn = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 > 0) {
                    evenLetterRow.append(array[i][j]);
                }
                if (j % 2 == 0) {
                    oddLetterColumn.append(array[j][i]);
                }
            }
        }
        return "even letter from row " + evenLetterRow + " odd letter from column " + oddLetterColumn;
    }
}
