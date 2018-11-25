package com.zbitnev.epam.recursion.exercise;

/**
 * Class to calculate factorial by recursion * return int;
 * Throw IllegalArgumentException
 *
 * @version 1.0
 * @exercise 10.42;
 * @autor Ivan Zbitnev
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number >= 0) {
            if (number <= 1) {
                return number;
            }
            return getFactorial(number - 1) * number;
        }
        throw new IllegalArgumentException("Number is less then ziro, parametr:  " + number);
    }
}
