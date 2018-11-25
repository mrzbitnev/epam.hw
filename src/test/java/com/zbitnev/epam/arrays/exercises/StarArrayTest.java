package com.zbitnev.epam.arrays.exercises;

import org.junit.Assert;
import org.junit.Test;

public class StarArrayTest {
    String harvestedLetter = "qwertyuiopasdfghjklzxcvbnm";
    int index = 0;

    @Test
    public void testGetLetter() {
        StarArray starArray = new StarArray();
        String expect = "first quastion (row) is: qetuoadgjlxvn and second (column) qaxujedvoltgn";
        Assert.assertEquals(expect, starArray.getLetter(testGetArray(5, 5)));
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