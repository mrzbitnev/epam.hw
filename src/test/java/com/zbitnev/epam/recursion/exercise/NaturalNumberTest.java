package com.zbitnev.epam.recursion.exercise;

import org.junit.Assert;
import org.junit.Test;

public class NaturalNumberTest {
    NaturalNumber naturalNumber = new NaturalNumber();

    @Test
    public void testGetSum() {
        int number = 5;
        int result = 15;
        Assert.assertEquals(result, naturalNumber.getSum(number));

        int numberOne = 1;
        int resultOne = 1;
        Assert.assertEquals(resultOne, naturalNumber.getSum(numberOne));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetSumException() {
        Assert.assertEquals(0, naturalNumber.getSum(-1));
    }

    @Test
    public void testGetMultiplication() {
        int number = 5;
        int result = 120;
        Assert.assertEquals(result, naturalNumber.getMultiplication(number));

        int numberOne = 1;
        int resultOne = 1;
        Assert.assertEquals(resultOne, naturalNumber.getMultiplication(numberOne));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetMultiplicationException() {
        Assert.assertEquals(0, naturalNumber.getSum(-1));
    }
}