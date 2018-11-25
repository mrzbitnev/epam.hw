package com.zbitnev.epam.arrays;

import java.util.Random;

/**
 * The ArrayCreator generate random char array, takes two parameters on columns - bigCircleSize and rows - smallCircleSize.
 * return char[][] with random sybmol;
 *
 * @version 1.0
 * @autor Ivan Zbitnev
 */
public class ArrayCreator {
    Random random = new Random();

    public char[][] getArray(int bigCircleSize, int smallCircleSize) {
        char[][] array = new char[bigCircleSize][smallCircleSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getNextChar();
            }
        }
        return array;
    }

    public char getNextChar() {
        return (char) (30 + random.nextInt(100));
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" ");
                System.out.print(array[i][j]);
            }
        }
        System.out.println("\n");
    }
}
