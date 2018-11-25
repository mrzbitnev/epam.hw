package com.zbitnev.epam.arrays.exercises;

import com.zbitnev.epam.arrays.ArrayCreator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringArrayTest {
    StringArray stringArray = new StringArray();
    ArrayCreator arrayCreator = new ArrayCreator();
    String harvestedLetter = "qwertyuiopasdfghjklzxcvbnm";
    int index = 0;

    @Test
    public void testGetStringFromArray() {
        int[] number = {3, 1, 5};
        String expect = "asdfg";
        assertEquals(expect, stringArray.getStringFromArray(testGetArray(5, 5), number));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetStringFromArrayException() {
        int[] number = {0, 1, 5};
        String expect = "asdfg";
        assertEquals(expect, stringArray.getStringFromArray(testGetArray(5, 5), number));
    }

    @Test
    public void testGetNumber() {
        int[] checkArray = {4, 1, 3};
        String checkInt = "413";
        assertEquals(Arrays.toString(checkArray), Arrays.toString(stringArray.getNumber(checkInt)));
    }

    @Test
    public void testCheckSizeWord() {
        int[] number = {2, 1, 5};
        int[] numberMaxFirst = {6, 1, 1};
        int[] numberMaxSecont = {1, 6, 5};
        int[] numberMaxThird = {1, 1, 6};
        int[] numberMinFirst = {0, 1, 2};
        int[] numberMinSecond = {1, 0, 2};
        int[] numberMinThird = {1, 1, 0};
        char[][] array = arrayCreator.getArray(5, 5);
        assertTrue(stringArray.isSizeNumFit(number, array));
        assertFalse(stringArray.isSizeNumFit(numberMaxFirst, array));
        assertFalse(stringArray.isSizeNumFit(numberMaxSecont, array));
        assertFalse(stringArray.isSizeNumFit(numberMaxThird, array));
        assertFalse(stringArray.isSizeNumFit(numberMinFirst, array));
        assertFalse(stringArray.isSizeNumFit(numberMinSecond, array));
        assertFalse(stringArray.isSizeNumFit(numberMinThird, array));
    }

    public char[][] testGetArray(int bigCircleSize, int smallCircleSize) {
        char[][] array = new char[bigCircleSize][smallCircleSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = testGetNextChar();
            }
        }
        return array;
    }

    public char testGetNextChar() {
        char[] harvestedArray = harvestedLetter.toCharArray();
        return harvestedArray[index++];
    }
}