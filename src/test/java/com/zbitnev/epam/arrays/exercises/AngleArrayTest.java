package com.zbitnev.epam.arrays.exercises;

import org.junit.Assert;
import org.junit.Test;

public class AngleArrayTest {
    String harvestedLetter = "qwertyuiopasdfghjklzxcvbnm";
    int index = 0;
    AngleArray angleArray = new AngleArray();

    @Test
    public void testGetAngleArray() {
        String expected = "qtxn";
        String result = angleArray.getAngleArray(testGetArray(5, 5));
        Assert.assertEquals(expected, result);
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