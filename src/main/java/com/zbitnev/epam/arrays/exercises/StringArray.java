package com.zbitnev.epam.arrays.exercises;

import com.zbitnev.epam.arrays.DataEntry;

import java.util.Arrays;

/**
 * The StringArray get number from DataEntry (System.in) and print chosen symbol from array.
 * throw ArrayIndexOutOfBoundsException;
 *
 * @version 1.0
 * @exercise 12.271;
 * @autor Ivan Zbitnev
 */
public class StringArray {

    public String launchStringFromArray(char[][] array) {
        int[] number = getNumber(getString());
        return getStringFromArray(array, number);
    }

    String getString() {
        System.out.println("\nPlease type three number - number of row," +
                " second - number start symbol in column, the third - number of end symbol column:");
        return new DataEntry().getNumber();
    }

    public String getStringFromArray(char[][] array, int[] number) {
        StringBuilder stringChosenNumber = new StringBuilder();
        if (isSizeNumFit(number, array)) {
            for (int i = number[1] - 1; i <= number[2] - 1; i++) {
                stringChosenNumber.append(array[number[0] - 1][i]);
            }
            return String.valueOf(stringChosenNumber);
        } else {
            throw new ArrayIndexOutOfBoundsException("your number " + Arrays.toString(number)
                    + "doesn't fit to our array " + array.length + " on " + array[0].length);
        }
    }

    public int[] getNumber(String numberInString) {
        if (numberInString.length() == 3) {
            int[] numberInArray = new int[3];
            int index = 0;
            for (String i : numberInString.split("")) {
                numberInArray[index] = Integer.parseInt(i);
                index++;
            }
            return numberInArray;
        } else {
            throw new ArrayIndexOutOfBoundsException("Your string doesn't fit" + numberInString);
        }
    }

    public boolean isSizeNumFit(int[] number, char[][] array) {
        return number[0] > 0 && number[0] - 1 <= array.length - 1 && number[1] - 1 < number[2] - 1
                && number[1] - 1 >= 0 && number[2] - 1 <= array[0].length - 1;
    }
}
