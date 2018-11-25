package com.zbitnev.epam.recursion.exercise;

/**
 * the class com.zbitnev.exercise.NaturalNumber int getSum() calculates the sum of digits of a natural number,
 * in getMultiplication() multiplicat of digits of a natural number;
 *
 * @version 1.0
 * @exercise 10.43;
 * @autor Ivan Zbitnev
 */
public class NaturalNumber {
    public int getSum(int number) {
        if (number > 0) {
            if (number <= 1) {
                return number;
            }
            return number + getSum(--number);
        }
        throw new IllegalArgumentException("Number is less then ziro, parametr:  " + number);
    }

    public int getMultiplication(int number) {
        if (number > 0) {
            if (number <= 1) {
                return number;
            }
            return number * getMultiplication(--number);
        }
        throw new IllegalArgumentException("Number is less then ziro, parametr:  " + number);
    }
}
