package com.zbitnev.epam.recursion.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void testGetFactorial() {
        int testNumber = 10;
        int result = 3628800;
        assertEquals(result, factorial.getFactorial(testNumber));
    }

    @Test
    public void testGetFactorialMinValue() {
        int minimumZero = 0;
        int minimumOne = 1;
        int minimumTwo = 2;
        int resultZero = 0;
        int resultOne = 1;
        int resultTwo = 2;
        assertEquals(resultZero, factorial.getFactorial(minimumZero));
        assertEquals(resultOne, factorial.getFactorial(minimumOne));
        assertEquals(resultTwo, factorial.getFactorial(minimumTwo));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialNegativeValue() {
        int negativNumber = -10;
        factorial.getFactorial(negativNumber);
    }
}