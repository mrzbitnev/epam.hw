package com.zbitnev.epam.recursion.exercise;

/**
 * the class com.zbitnev.exercise.Exponentiation is calculating the number ^ extend;
 * Throw IllegalArgumentException
 *
 * @version 1.0
 * @exercise 10.42;
 * @autor Ivan Zbitnev
 */
public class Exponentiation {
    public int getExponentiation(int number, int extent) {
        if (number >= 0 && extent >= 1) {
            if (extent == 1) {
                return number;
            }
            return number * getExponentiation(number, extent - 1);
        }
        throw new IllegalArgumentException("your parameter is not allowed: " + number);
    }
}