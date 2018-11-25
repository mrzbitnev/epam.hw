package com.zbitnev.epam.arrays.exercises;

import org.junit.Assert;
import org.junit.Test;

public class LetterArrayTest {
    String harvestedLetter = "qwertyuiopasdfghjklzxcvbnm";
    int index = 0;

    @Test
    public void testGetEvenFromRow() {
        LetterArray letterArray = new LetterArray();
        String example = "even letter from row wruosfjlcb odd letter from column qaxwscedvrfbtgn";
        char[][] array = testGetArray(5, 5);
        String result = letterArray.getEvenFromRow(array);
        Assert.assertEquals(example, result);
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