package com.zbitnev.epam.recursion.exercise;

import org.junit.Assert;
import org.junit.Test;

public class ExponentiationTest {
    Exponentiation exponentiation = new Exponentiation();

    @Test
    public void testGetExponentiation() {
        int numder = 3;
        int extent = 3;
        int extentOne = 1;
        int result = 27;
        Assert.assertEquals(result, exponentiation.getExponentiation(numder, extent));
        Assert.assertEquals(numder, exponentiation.getExponentiation(numder, extentOne));

        int numberOne = 1;
        int numberZero = 0;
        Assert.assertEquals(numberOne, exponentiation.getExponentiation(numberOne, extent));
        Assert.assertEquals(numberZero, exponentiation.getExponentiation(numberZero, extent));

        int numberTen = 10;
        int extentFive = 5;
        int resultMax = 100000;
        Assert.assertEquals(resultMax, exponentiation.getExponentiation(numberTen, extentFive));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetExponentiationExceptionNumber() {
        Assert.assertEquals(0, exponentiation.getExponentiation(-1, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetExponentiationExceptionExtent() {
        Assert.assertEquals(0, exponentiation.getExponentiation(1, -2));
    }
}