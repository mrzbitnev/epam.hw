package com.zbitnev.epam.lambda;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {
    Sum sum = new Sum();

    @Test
    public void testGetSum() {
        int firstOperand = 5;
        int secondOperand = 6;
        int result = 11;
        Assert.assertEquals(result, sum.getSum(firstOperand, secondOperand));
    }
}